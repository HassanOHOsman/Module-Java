package tasks;

public class TimedTask extends Task {
    private LocalDate deadline;
    private double durationInHours;

    @Override
    public String getStatus() {
        if (!isCompleted()){
            return "Summary:\nTask ID: " + getId() + "\nDescription: " + getDescription() + "\nDeadline: " + deadline +
                    "\nDuration: " + durationInHours + " hours" + "\nCompletion Status: has not been completed yet";
        }
        return "Summary:\nTask ID: " + getId() + "\nDescription: " + getDescription() + "\nDeadline: " + deadline +
                "\nDuration: " + durationInHours + " hours" + "\nCompletion Status: Completed";

    }





}
