<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <h1>Simple questionnaire</h1>
  <form:form method="POST" action="submit">
    <table>
      <tr>
        <td>Do you like this site?</td>
        <td><form:checkbox path="likesSite"/>
        </td>
        <td><form:errors path="likesSite" cssClass="error" />
        </td>
      </tr>
      </table>
    <input type="submit" value="Submit">
    </form:form>

</body>
</html>
