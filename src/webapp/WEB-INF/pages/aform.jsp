<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}
</style>
</head>
<body>
	<h2>Do you like a newsletter?</h2>
 
	<form:form method="POST" action="addNewsletterQue">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="userName" />
				</td>
				<td><form:errors path="userName" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:textarea path="address" />
				</td>
				<td><form:errors path="address" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Do you like a newsletter? :</td>
				<td><form:checkbox path="youLikeNewsletter" />
				</td>
				<td><form:errors path="youLikeNewsletter" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td>Sex :</td>
				<td><form:radiobutton path="sex" value="M" />Male 
                                       <form:radiobutton path="sex" value="F" />Female</td>
				<td><form:errors path="sex" cssClass="error" />
				</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
 
</body>
</html>