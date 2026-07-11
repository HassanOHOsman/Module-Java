package management;

import tasks.Task;

public class TaskManager {

    private Task[] tasks;
    private int taskCount;

    public void addTask(Task task) {
        tasks[taskCount] = task;
        taskCount++;
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.complete();
            }
        }
    }

}
