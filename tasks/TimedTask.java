package tasks;

import java.time.LocalDate;

public class TimedTask extends Task {
    private LocalDate deadline;
    private double durationInHours;

    public TimedTask(int id, String description, boolean completed, LocalDate deadline, double durationInHours) {
        super(id, description, completed);
        this.deadline = deadline;
        this.durationInHours = durationInHours;
    }

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
