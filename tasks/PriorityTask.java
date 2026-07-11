package tasks;

public class PriorityTask extends Task{
    private String priority;
    private boolean isApprovalRequired;

    @Override
    public String getStatus() {
        if (!isCompleted()){
            return "Summary:\nTask ID: " + getId() + "\nDescription: " + getDescription() + "\nPriority: " + priority +
                    "\nRequire Approval? : " + isApprovalRequired + "\nCompletion Status: has not been completed yet";
        }
        return "Summary:\nTask ID: " + getId() + "\nDescription: " + getDescription() + "\nPriority: " + priority +
                "\nRequire Approval? : " + isApprovalRequired + "\nCompletion Status: Completed";

    }


}
