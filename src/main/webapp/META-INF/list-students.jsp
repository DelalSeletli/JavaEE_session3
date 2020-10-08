<%--
  Created by IntelliJ IDEA.
  User: Delal Seletli
  Date: 08/10/2020
  Time: 09:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Web main.Student Tracker</title>
    <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<!-- ${STUDENT_LIST}-->
<div id="wrapper">
    <div id="header">
        <h2>ESILV Engineer School</h2>
    </div>
</div>
<div id="container">
    <div id="content">
        <table>
            <tr>
                <th>First Name </th>
                <th>Last Name</th>
                <th>Email </th>
            </tr>
            <c:forEach var="tempStudent" items="${STUDENT_LIST }" >
            <tr>
                <td> ${tempStudent.first_Name}</td>
                <td> ${tempStudent.last_Name}</td>
                <td> ${tempStudent.email}</td>
                </c:forEach>
        </table>
    </div>
</div>
</body>
</html>