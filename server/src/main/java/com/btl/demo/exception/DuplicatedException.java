package com.btl.demo.exception;

public class DuplicatedException extends RuntimeException {
  public DuplicatedException(String message) {
    super(message);
  }

  public DuplicatedException(String message, Throwable cause) {
    super(message, cause);
  }

  public DuplicatedException(Throwable cause) {
    super(cause);
  }
}
