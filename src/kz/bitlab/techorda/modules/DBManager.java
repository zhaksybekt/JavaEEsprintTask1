package kz.bitlab.techorda.modules;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private static Long id= 4L ;
    private static List<WebPortal> tasks = new ArrayList<>();
    static {
        tasks.add(new WebPortal(1l,"JAVA EE TASK","YES","19.08.2003","GOOD PROJECT"));
        tasks.add(new WebPortal(2l,"JAVA EE TASK","YES","19.08.2003","GOOD PROJECT"));
        tasks.add(new WebPortal(3l,"JAVA EE TASK","YES","19.08.2003","GOOD PROJECT"));
    }


    public static void addTask(WebPortal task) {
        tasks.add(task);
        task.setId(id);
        id++;
    }

    public static WebPortal getTask(Long id) {
        for (WebPortal task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }
    public static List<WebPortal> getAllTask(){
        return tasks;
    }



    public static void deleteTask(Long id) {
        WebPortal taskToRemove = null;
        for (WebPortal task : tasks) {
            if (task.getId().equals(id)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
        }
    }

}











