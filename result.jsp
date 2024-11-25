<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Details</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <h2>User Registration Complete!</h2>

        <h3>Registration Details</h3>
        <p><strong>Full Name:</strong> ${user.firstName} ${user.surname}</p>
        <p><strong>Father's Name:</strong> ${user.fathersName}</p>
        <p><strong>Mother's Name:</strong> ${user.mothersName}</p>
        <p><strong>Mobile Number:</strong> ${user.mobileNumber}</p>
        <p><strong>Date of Birth:</strong> ${user.dob}</p>
        <p><strong>Holding Number:</strong> ${user.holdingNumber}</p>

        <!-- Here you can add logic to display service options and statuses -->
        <h3>Choose a service:</h3>
        <ul>
            <li>Check Tax Payment Status</li>
            <li>Birth Registration Status</li>
            <li>NID Status</li>
        </ul>
    </div>
</body>
</html>
