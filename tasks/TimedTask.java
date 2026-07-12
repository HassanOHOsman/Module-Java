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
            return "** Summary **\n* Task ID: " + getId() + "\n* Description: " + getDescription() + "\n* Deadline: " + deadline +
                    "\n* Duration: " + durationInHours + " hours" + "\n* Completion Status: Incomplete";
        }
        return "** Summary **\n* Task ID: " + getId() + "\n* Description: " + getDescription() + "\n* Deadline: " + deadline +
                "\n* Duration: " + durationInHours + " hours" + "\n* Completion Status: Completed";

    }





}
