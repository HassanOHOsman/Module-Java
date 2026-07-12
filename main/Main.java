package main;

import tasks.*;
import management.TaskManager;

import java.time.LocalDate;

public class Main {

    static void main(String[] args) {
        Task task = new Task(333,"Email customised onboarding guide to new-hires", true);
        System.out.println(task.getStatus());

        PriorityTask priorityTask = new PriorityTask(404, "Finance Team experiencing tech issues", false, "High", false);
        System.out.println(priorityTask.getStatus());

        TimedTask timedTask = new TimedTask(159, "Compliance Team needs new screens", false, LocalDate.of(2026, 8, 1), 72);
        System.out.println(timedTask.getStatus());

        TaskManager taskManager = new TaskManager(new Task[10], 0);
        taskManager.addTask(task);
        taskManager.addTask(priorityTask);
        taskManager.addTask(timedTask);

        taskManager.completeTask(404);
        taskManager.completeTask(159);

        System.out.println(taskManager.getTasksByStatus(true));

    }



}
