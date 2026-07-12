package management;

import tasks.Task;

public class TaskManager {

    private Task[] tasks;
    private int taskCount;

    public TaskManager(Task[] tasks, int taskCount) {
        this.tasks = tasks;
        this.taskCount = taskCount;
    }

    public void addTask(Task task) {
        tasks[taskCount] = task;
        taskCount++;
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task == null) {
                continue;
            }
            if (task.getId() == id) {
                task.complete();
            }
        }
    }

    public Task[] getTasksByStatus(boolean completed) {

        int count = 0;

        for (int i = 0; i < taskCount; i++) {
            if(tasks[i].isCompleted() == completed) {
                count++;
            }
        }
        Task[] tasksByCompletionStatus = new Task[count];

        int index = 0;

        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                tasksByCompletionStatus[index] = tasks[i];
                index++;
            }
        }
        return tasksByCompletionStatus;

    }

    }




