<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.springmvc.pmvc.beans.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Faculty Dashboard</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("facultyName") %></h2>

    <h3>Assigned Courses</h3>
    <table border="1">
        <tr>
            <th>Course ID</th>
            <th>Course Name</th>
            <th>Duration</th>
        </tr>
        <%
            List<Course1> courses = (List<Course1>) session.getAttribute("assignedCourses");
            if (courses != null) {
                for (Course1 course : courses) {
        %>
        <tr>
            <td><%= course.getId() %></td>
            <td><%= course.getName() %></td>
            <td><%= course.getDuration() %></td>
        </tr>
        <% 
                }
            }
        %>
    </table>

    <a href="logout.jsp">Logout</a>
</body>
</html>
