<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="kz.bitlab.techorda.modules.WebPortal" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="vender/head.jsp"
    %>
</head>
<body>
<%@include file="vender/navbar.jsp"%>
<div class="container">
    <div class="row-mt-5">
        <div class="col-sm-12">
            <%
                WebPortal portal= (WebPortal) request.getAttribute("portal");
                if (portal!=null){
            %>
            <div class="container mt-3">
                <div class="mt-4 p-5 bg-primary  text-white ">
                    <p> NAME: <%=portal.getName()%></p>
                    <p> DEADLINE: <%=portal.getDeadlineDate()%> </p>
                    <p> DESCRIPTION: <%=portal.getDescription()%></p>
                </div>
            </div>
            <%
                }
            %>
            <br><br><br>
        </div>
    </div>
</div>
</body>
</html>
