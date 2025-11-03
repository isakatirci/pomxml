package se.magnus.api.exceptions;

public class BadRequestException extends RuntimeException {

  private static final long serialVersionUID = -4838181732880047884L; // Add this for warning
  public BadRequestException() {}

  public BadRequestException(String message) {
    super(message);
  }

  public BadRequestException(String message, Throwable cause) {
    super(message, cause);
  }

  public BadRequestException(Throwable cause) {
    super(cause);
  }
}
