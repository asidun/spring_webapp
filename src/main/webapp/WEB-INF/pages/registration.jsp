<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Please fill in the registration form</h1>

<form:form method="POST" commandName="userName" action="/registration/registerUser">
    <table>
        <tr>
            <td><form:label path="firstName">First name :</form:label></td>
            <td><form:input path="firstName" /> </td>
            <td><form:errors path="firstName" cssStyle="color: #ff0000"/></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Last name :</form:label></td>
            <td><form:input path="lastName" /> </td>
            <td><form:errors path="lastName" cssStyle="color: #ff0000"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Email :</form:label></td>
            <td><form:input path="email" /> </td>
            <td><form:errors path="email" cssStyle="color: #ff0000"/></td>
        </tr>
        <tr>
            <td><form:label path="dateOfBirth">Enter day of your birthday (yyyy-MM-dd):</form:label></td>
            <td><form:input path="dateOfBirth" /> </td>
            <td><form:errors path="dateOfBirth" cssStyle="color: #ff0000"/></td>
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
