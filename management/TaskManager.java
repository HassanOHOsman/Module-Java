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

    public Task[] getTasksByStatus(boolean completed) {

        Task[] tasksByCompletionStatus = new Task[10];
        int index = 0;

        for (Task task : tasks) {
            if (task.isCompleted() == completed) {
                tasksByCompletionStatus[index] = task;
                index++;
            }

        }
        return tasksByCompletionStatus;
    }



}
