package main;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

public class StudentControllerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StudentDbUtil studentDbUtil;

    @Resource(name="jdbc/email_adress")
    private DataSource dataSource;

    private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<Student> students = studentDbUtil.getStudents();
        request.setAttribute("STUDENT_LIST", students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("META-INF/list-students.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            listStudents(request,response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {
        super.init();
        studentDbUtil = new StudentDbUtil(dataSource);
    }
}
