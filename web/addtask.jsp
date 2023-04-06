<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
    <%@include file="vender/head.jsp"
    %>
</head>
<body>
<%@include file="vender/navbar.jsp"%>
<div class="container" >
    <div class="row-mt-5">
        <div class="col-sm-6 offset 3">
            <form action="/AddTask" method="post" style="width: 400px;
                                                   position: fixed; top: 50%; left: 50%;
                                                   -webkit-transform: translate(-50%, -50%);
                                                   -ms-transform: translate(-50%, -50%);
                                                    transform: translate(-50%, -50%);
                                                    " >
                <div class="form-group">
                    <label for="name" class="form-label">Name:</label>
                    <input type="text" name="name" class="form-control" id="name">
                </div>
                <div class="form-group">
                    <label for="status" class="form-label">Status:</label>
                    <input type="text" name="status" class="form-control" id="status">
                </div>
                <div class="form-group">
                    <label for="description" class="form-label">Description:</label>
                    <textarea name="description" class="form-control" id="description" rows="4"></textarea>
                </div>
                <div class="form-group">
                    <label for="deadline" class="form-label">Deadline:</label>
                    <input type="date" name="deadline" class="form-control" id="deadline">
                </div>
                <button class="btn btn-primary">Add Task</button>
                <% String success = request.getParameter("success");
                    if (success != null) { %>
                <div class="alert alert-success alert-dismissible fade show my-3" role="alert">
                    Task added successfully!
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
                <% } %>
            </form>
        </div>
    </div>
</div>
</body>
</html>
