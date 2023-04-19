package kz.bitlab.techorda.modules;

import java.util.ArrayList;

public class DBManager {

    private static final ArrayList<Task> tasks = new ArrayList<>();

    private static int id = 6;

    static {
        tasks.add(
                new Task(1,
                        "Create new project on JAVA",
                        "25.06.2023",
                        "YES"


                )
        );
        tasks.add(
                new Task(2,
                        "Create new project on JAVA",
                        "25.06.2023",
                        "YES"

                        )
        );
        tasks.add(
                new Task(3,
                        "Create new project on JAVA",
                        "25.06.2023",
                        "YES"


                        )
        );
        tasks.add(
                new Task(4,
                        "Create new project on JAVA",
                        "25.06.2023",
                        "YES"


                        )
        );
        tasks.add(
                new Task(5,
                        "Create new project on JAVA",
                        "25.06.2023",
                        "YES"


                        )
        );
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static void addTasks(Task task) {
        task.setId(id);
        tasks.add(task);
        id++;
    }

    public static Task getTasks(int id) {
        return tasks
                .stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static void updateTasks(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                break;
            }
        }
    }

    public static void deleteTasks(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getId()==id){
                tasks.remove(i);
                break;
            }
        }
    }
}