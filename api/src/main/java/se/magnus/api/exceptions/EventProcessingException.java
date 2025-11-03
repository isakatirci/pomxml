package se.magnus.api.exceptions;

public class EventProcessingException extends RuntimeException {
  private static final long serialVersionUID = -973437739292953285L; // Add this for warning

  public EventProcessingException() {
  }

  public EventProcessingException(String message) {
    super(message);
  }

  public EventProcessingException(String message, Throwable cause) {
    super(message, cause);
  }

  public EventProcessingException(Throwable cause) {
    super(cause);
  }
}
