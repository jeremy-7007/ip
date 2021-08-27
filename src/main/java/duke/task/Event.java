package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    private LocalDateTime at;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy - HH:mm");

    public Event(String description, String at) {
        super(description);
        this.at = LocalDateTime.parse(at, formatter);
    }

    public Event(String description, LocalDateTime at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return ("[E]" + super.toString() + " (at: " + this.at.format(displayFormatter) + ")");
    }

    public String toStorageString() {
        return ("E|" + super.getStatusNumber() + "|" + super.getDescription()
                + "|" + this.at.format(displayFormatter));
    }
}