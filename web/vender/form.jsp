<form action="/AddTask" method="post" >
  <div class="form-group">
    <label for="name" class="form-label">Name:</label>
    <input type="text" name="name" class="form-control" id="name">
  </div>
  <div class="form-group">
    <label for="status" class="form-label" >DESCRIPTION:</label>
    <textarea name="status" class="form-control" id="status" rows="4"></textarea>
  </div>
  <div class="form-group">
    <label for="deadline" class="form-label">Deadline:</label>
    <input type="date" name="deadline" class="form-control" id="deadline">
  </div>
  <div class="form-group">
    <label for="description" class="form-label">STATUS:</label>
    <input type="text" checked value="YES"   name="description" class="form-control" id="description">
  </div>
  <button class="btn btn-primary">Add Task</button>
</form>