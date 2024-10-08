<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>ask-emp-details-button</title>
</head>
<body>
    <h2>Dear Employee, please enter your details</h2>
    <br><br>

    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <br><br>
        Salary <form:input path="salary"/>
        <br><br>
        Department <form:select path="department">
            <form:options items="${employee.departments}"/>
        </form:select>
        <br><br>
        Which car do you want?
        <form:radiobuttons path="carBrand" items= "${employee.carBrands}"/>
        <br><br>
        <input type="submit" value="OK"/>
    </form:form>
</body>
</html>
