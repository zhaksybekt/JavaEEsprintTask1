
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form action="/add-book" method="post">
  <div class="row">
    <div class="col-12">
      <label>NAME : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name="task_name">
    </div>
  </div>
  <div class="row mt-3">
    <div class="col-12">
      <label>DEADLINE : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="date" class="form-control" name="task_dd">
    </div>
  </div>
  <div class="row mt-3">
    <div class="col-12">
      <label>STATUS : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name="task_status">
    </div>
  </div>


  <div class="row mt-3">
    <div class="col-12">
      <button class="btn btn-success">ADD TASK</button>
    </div>
  </div>
</form>