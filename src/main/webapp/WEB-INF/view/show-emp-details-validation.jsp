<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>show-emp-details-checkbox</title>
</head>

<h2>Dear Employee, you are welcome</h2>

<br>
<br>
<body>
    Your name: ${employee.name}
    <br>
    Your surname: ${employee.surname}
    <br>
    Your phone number: ${employee.phoneNumber}
    <br>
    Your email: ${employee.email}
    <br>
    Your salary: ${employee.salary}
    <br>
    Your department: ${employee.department}
    <br>
    Your car: ${employee.carBrand}
    <br>
    Language(s):
    <ul>
        <c:forEach var="lang" items="${employee.languageList}">
            Don work, i don,t know why
            <li>${lang}</li>
        </c:forEach>
    </ul>
</body>

</html>
