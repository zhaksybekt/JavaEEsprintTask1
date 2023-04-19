package kz.bitlab.techorda.modules;
public class Task {
    private int id;
    private String name;
    private String deadlinedate;
    private String status;


    public Task() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadlinedate() {
        return deadlinedate;
    }

    public void setDeadlinedate(String deadlinedate) {
        this.deadlinedate = deadlinedate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Task(int id, String name, String deadlinedate, String status) {
        this.id = id;
        this.name = name;
        this.deadlinedate = deadlinedate;
        this.status = status;
    }
}
