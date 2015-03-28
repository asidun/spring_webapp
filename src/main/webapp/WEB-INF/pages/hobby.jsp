<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Form for hobbies input
    </title>
</head>
<body>
<h2>Provide name and description for one of your hobbies</h2>

<form:form method="POST" action="hobby/addHobby">
    <table>
        <tr>
            <td><form:label path="name">Hobby name :</form:label></td>
            <td><form:input path="name" /> </td>
        </tr>
        <tr>
            <td><form:label path="description">Hobby description :</form:label></td>
            <td><form:input path="description" /> </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Submit" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>