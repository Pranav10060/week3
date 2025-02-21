<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Faculty Registration</title>
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
            background-color: #28a745;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Faculty Registration</h2>
        <!-- Form for faculty registration -->
        <form action="registerFaculty" method="post">
            
            <!-- Input field for Faculty ID -->
            <label for="id">Faculty ID:</label>
            <input type="number" id="id" name="id" required>
            
            <!-- Input field for Faculty Name -->
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            
            <!-- Input field for Faculty Email -->
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            
            <!-- Input field for Password -->
            <label for="pass">Password:</label>
            <input type="password" id="pass" name="pass" required>
            
            <!-- Input field for Mobile Number -->
            <label for="mobile">Mobile:</label>
            <input type="text" id="mobile" name="mobile" required>
            
            <!-- Submit button for registration -->
            <button type="submit">Register</button>
        </form>
    </div>
</body>
</html>
