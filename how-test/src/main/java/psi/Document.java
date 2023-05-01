package psi;

import java.time.Instant;

public class Document {

    private final String content;
    private final Instant deadline;

    public Document(String content, Instant deadline) {
        this.content = content;
        this.deadline = deadline;
    }

    public String getContent() {
        return content;
    }

    public Instant getDeadline() {
        return deadline;
    }
}