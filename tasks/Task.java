package tasks;

public class Task {

    private final int id;
    private String description;
    private boolean completed;

    public void complete() {
        if (!completed) {
            completed = true;
        }

    }

    public String getStatus(int id, ) {
        return "Task ID: " + id
    }




}
