<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <style>
        .error {
        color: #ff0000;
        }
        .errorblock {
            color: #ff0000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1>Registration</h1>
<form:form modelAttribute="registration">
    <form:errors path="personName" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td>
                <spring:message code="personName" />:
            </td>
            <td>
                <form:input path="personName" />
            </td>
            <td>
               <form:errors path="personName" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="register">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
