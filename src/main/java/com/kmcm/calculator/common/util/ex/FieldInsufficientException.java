package com.kmcm.calculator.common.util.ex;

/**
 * 可以用不足
 */
public class FieldInsufficientException extends ServiceException {

	private static final long serialVersionUID = -8881103463792318580L;

	public FieldInsufficientException() {
		super();
	}

	public FieldInsufficientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FieldInsufficientException(String message, Throwable cause) {
		super(message, cause);
	}

	public FieldInsufficientException(String message) {
		super(message);
	}

	public FieldInsufficientException(Throwable cause) {
		super(cause);
	}

}
