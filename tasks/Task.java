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

    public String getStatus() {
        if (!completed){
            return "Summary:\nTask ID: " + id + "\nDescription: " + description + "\nCompletion Status: has not been completed yet";
        }
        return "Summary:\nTask ID: " + id + "\nDescription: " + description + "\nCompletion Status: Completed";

    }




}
