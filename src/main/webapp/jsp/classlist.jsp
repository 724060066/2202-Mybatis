<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
    <meta charset="UTF-8">
</head>
<body>
<table>
    <tr>
        <th>班级名</th>
        <th>成立时间</th>
    </tr>
    <c:forEach items="${classesList}" var="cla">
        <tr>
            <td>
                <a href="${pageContext.request.contextPath }/student/listStudentByClassId?cId=${cla.id}&cName=${cla.className}">
                    ${cla.className}
                </a>
            </td>
            <td>${cla.createDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
