package tasks;

public class PriorityTask extends Task{
    private String priority;
    private boolean isApprovalRequired;

    public PriorityTask(int id, String description, boolean completed, String priority, boolean isApprovalRequired) {
        super(id, description, completed);
        this.priority = priority;
        this.isApprovalRequired = isApprovalRequired;
    }

    @Override
    public String getStatus() {
        if (!isCompleted()){
            return "** Summary **\n* Task ID: " + getId() + "\n* Description: " + getDescription() + "\n* Priority: " + priority +
                    "\n* Require Approval? : " + isApprovalRequired + "\n* Completion Status: Incomplete";
        }
        return "** Summary **\n* Task ID: " + getId() + "\n* Description: " + getDescription() + "\n* Priority: " + priority +
                "\n* Require Approval? : " + isApprovalRequired + "\n* Completion Status: Completed";

    }


}
