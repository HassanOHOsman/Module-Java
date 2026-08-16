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

        return  super.getStatus() + "\n* Priority: " + priority +
                "\n* Require Approval? : " + isApprovalRequired;

    }


}
