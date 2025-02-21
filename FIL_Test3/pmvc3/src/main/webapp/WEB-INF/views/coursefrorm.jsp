<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Course Registration</title>
    <style>
        /* Basic styling for form layout */
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            width: 50%;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px gray;
        }
        input, button {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Course Registration</h2>
        <!-- Form for course registration -->
        <form action="registerCourse" method="post">
            
            <!-- Input field for Course ID -->
            <label for="id">Course ID:</label>
            <input type="number" id="id" name="id" required>
            
            <!-- Input field for Course Name -->
            <label for="name">Course Name:</label>
            <input type="text" id="name" name="name" required>
            
            <!-- Input field for Course Duration -->
            <label for="duration">Duration:</label>
            <input type="text" id="duration" name="duration" required>
            
            <!-- Submit button for registration -->
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
