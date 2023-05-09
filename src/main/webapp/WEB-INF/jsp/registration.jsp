<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
<h1>Registration</h1>
<form:form modelAttribute="registration">
    <table>
        <tr>
            <td>
                <spring:message code="personName" />:
            </td>
            <td>
                <input type="text" id="personName" name="personName" required>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Register">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
