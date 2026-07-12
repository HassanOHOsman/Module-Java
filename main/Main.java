package main;

import tasks.*;
import management.TaskManager;

public class Main {

    static void main(String[] args) {
        Task task = new Task(333," Send onboarding guide to new-hires", false);
        System.out.println(task.getStatus());


    }



}
