<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Union Office Management</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>Welcome to Union Office Management System</h2>
        <form action="union-office" method="POST">
            <label>First Name:</label>
            <input type="text" name="firstName" required><br>

            <label>Surname:</label>
            <input type="text" name="surname" required><br>

            <label>Father's Name:</label>
            <input type="text" name="fathersName" required><br>

            <label>Mother's Name:</label>
            <input type="text" name="mothersName" required><br>

            <label>Mobile Number:</label>
            <input type="text" name="mobileNumber" required><br>

            <label>Date of Birth (DD/MM/YYYY):</label>
            <input type="text" name="dob" required><br>

            <label>Holding Number:</label>
            <input type="number" name="holdingNumber" required><br>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
