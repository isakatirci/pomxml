package se.magnus.api.exceptions;

public class NotFoundException extends RuntimeException {
  private static final long serialVersionUID = -7746630575092777062L; // Add this for warning

  public NotFoundException() {}

  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public NotFoundException(Throwable cause) {
    super(cause);
  }
}
