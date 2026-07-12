package main;

import tasks.*;
import management.TaskManager;

public class Main {

    static void main(String[] args) {
        Task task = new Task(333,"Email customised onboarding guide to new-hires", true);
        System.out.println(task.getStatus());

        PriorityTask priorityTask = new PriorityTask(404, "Finance Team experiencing tech issues", false, "High", false);
        System.out.println(priorityTask.getStatus());

    }



}
