package tasks;

public class Task {

    private final int id;
    private String description;
    private boolean completed;

    public Task(int id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public void complete() {
        if (!completed) {
            completed = true;
        }

    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        if (!completed){
            return "Summary:\nTask ID: " + id + "\nDescription: " + description + "\nCompletion Status: has not been completed yet";
        }
        return "Summary:\nTask ID: " + id + "\nDescription: " + description + "\nCompletion Status: Completed";

    }




}
