<%@ page import="kz.bitlab.techorda.modules.WebPortal" %>
<%@ page import="java.util.List" %>
<%@ page import="kz.bitlab.techorda.modules.DBManager" %>
<html >
<head>
  <%@include file="vender/head.jsp"%>
  <title>Task Manager</title>
  <meta charset="UTF-8">
</head>
<body>
<%@include file="vender/navbar.jsp"%>
<!-- Button trigger modal -->
<br>
<br>

<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop" style="margin-left: 120px">
  +AddTask
</button>
<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true" style="align-items: center">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="staticBackdropLabel" style="margin-left: 40%">Loading page</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body" >
        <div class="container-fluid">
          <div class="row mt-5">
            <div class="col-md-8 offset-md-2">
              <%@include file="vender/form.jsp"%>

            </div>
          </div>
        </div>
      </div>
    </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
<div class="container">
  <div class="row-mt-5">
    <div class="col-sm-12">
<table class="table">
  <tr>
    <th>ID</th>
    <th>NAME OF TASK</th>
    <th>LOADING STATUS</th>
    <th>DEADLINE</th>
    <th>ACTIONS</th>
    <th>DETAILS</th>
  </tr>
  <%
    List<WebPortal> tasks = DBManager.getAllTask();
    for (WebPortal task:tasks) {
  %>
  <tr>
    <td><%= task.getId() %></td>
    <td><%= task.getName() %></td>
    <td><%=task.getStatus()%></td>
    <td><%= task.getDeadlineDate() %></td>
    <td>
      <a href="DeleteTaskServlet?id=<%= task.getId() %>" style="text-decoration: none" >Delete </a>
    </td>
    <td>
      <a href="/details?id=<%=task.getId()%>" class="btn btn-info btn-sm" >DETAILS</a>
    </td>
  </tr>
  <%
    }
  %>
</table>
    </div>
  </div>
</div>
</body>
</html>