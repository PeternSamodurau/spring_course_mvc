<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!--Эта строка подключает библиотеку тегов Spring Form, которая предоставляет специальные теги для работы с формами.-->

<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>ask-emp-details-input</title>
</head>
<body>
    <h2>Dear Employee, please enter your details</h2>
    <br>
    <br>

    <form:form action="showDetails" modelAttribute="employee">
    <!--Этот тег создает форму, которая отправляет данные на URL showDetails.
     Атрибут modelAttribute="employee" указывает, что данные формы будут связаны с объектом employee-->

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="Submit"/>

</form:form>
</body>

</html>
