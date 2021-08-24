import java.time.format.DateTimeParseException;

public class Task {
    private String description;
    private boolean isDone;
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return this.isDone ? "[X]" : "[ ]"; // Done task marked with X
    }

    public String getDescription() {
        return this.description;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markAsNotDone() {
        this.isDone = false;
    }

    public void changeDescription(String newDesc) {
        this.description = newDesc;
    }

    @Override
    public String toString() {
        return (this.getStatusIcon() + " " + this.getDescription());
    }
}
