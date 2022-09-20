<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>省市县三级联动</title>
    <meta charset="UTF-8">
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-1.8.3.min.js"></script>
    <script>
        $(document).ready(function () {
            $("#provinceId").on("change", function () {
                $("#city").empty();
                $.ajax({
                    type: "post",// 指定请求提交的类型 get/post
                    url:"${pageContext.request.contextPath }/liandong/listCity",//请求的url
                    data:{provinceId:$("#provinceId").val()},
                    dataType:"json",
                    success:function(data){//data：返回数据（json对象）
                        $("#city").append("<option value=''>--请选择--</option>");
                        $.each(data, function (index,item){
                            $("#city").append("<option value='"+item.cityId+"'>"+item.city+"</option>");
                        });
                    }
                });
            });
        });
    </script>
</head>
<body>
省：<select name="provinceId" id="provinceId">
    <option value="">--请选择--</option>
    <c:forEach items="${provinceList}" var="province">
        <option value="${province.provinceId}">${province.province}</option>
    </c:forEach>
</select>
市：<select name="city" id="city">

</select>
</body>
</html>
