<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap-4.3.1/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1/jquery.js" ></script>
<script type="text/javascript" src="/resource/bootstrap-4.3.1/js/bootstrap.js"></script>
<script type="text/javascript" src="/resource/js/jqueryvalidate/jquery.validate.js"></script>
<script type="text/javascript" src="/resource/js/jqueryvalidate/localization/messages_zh.js"></script>
</head>
<script type="text/javascript">
	function bian(){
		$("form").submit();
	}
	function page(page){
		$("[name=page]").val(page);
		bian();
	}
</script>
<body>
        <table class="table">
        	<thead>
        		<tr>
        			<td colspan="10">
        				<form action="list" method="post">
        					<input type="hidden" name="page">
        					开始时间:<input type="date" name="date1" value="${date1}">----
        					结束时间:<input type="date" name="date2" value="${date2}">
        					<input type="submit" value="查询">
        					&emsp;&emsp;
        					<select  name="dtj"  onchange="bian()">
        						<option <c:if test="${dtj=='created'}">selected</c:if> value="created">发表时间</option>
        						<option <c:if test="${dtj=='user_id'}">selected</c:if> value="user_id">作者Id</option>
        						<option <c:if test="${dtj=='commentCnt'}">selected</c:if> value="commentCnt">评论数量</option>
        					</select>
        				</form>
        			</td>
        		</tr>
        		<tr>
        			<td>ID</td>
        			<td>标题</td>
        			<td>发表时间</td>
        			<td>作者Id</td>
        			<td>评论数量</td>
        		</tr>
        	</thead>
        	<tbody>
        		<c:forEach items="${pageinfo.list}" var="art">
        			<tr>
        				<td>${art.id }</td>
        				<td>${art.title }</td>
        				<td>${art.created }</td>
        				<td>${art.user_id }</td>
        				<td>${art.commentCnt}</td>
        			</tr>
        		</c:forEach>
        	</tbody>
        	<tfoot>
        		<tr>
        			<td colspan="10">
        				<center>
        					<c:forEach begin="${pageinfo.pageNum-2>1?pageinfo.pageNum-2:1}" 
        					end="${pageinfo.pageNum+2<pageinfo.pages?pageinfo.pageNum+2:pageinfo.pages}" 
        					varStatus="index">
        					<button onclick="page(${index.index })">${index.index }</button>
        					</c:forEach>
        				</center>
        			</td>
        		</tr>
        	</tfoot>
        </table>
</body>
</html>