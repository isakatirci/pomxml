package se.magnus.api.exceptions;

public class InvalidInputException extends RuntimeException {
  private static final long serialVersionUID = -1937206051898880819L; // Add this for warning

  public InvalidInputException() {}

  public InvalidInputException(String message) {
    super(message);
  }

  public InvalidInputException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidInputException(Throwable cause) {
    super(cause);
  }
}
