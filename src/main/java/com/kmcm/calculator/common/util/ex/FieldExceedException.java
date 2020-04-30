package com.kmcm.calculator.common.util.ex;

/**
 * 数据超过
 */
public class FieldExceedException extends ServiceException {

	private static final long serialVersionUID = -8881103463792318580L;

	public FieldExceedException() {
		super();
	}

	public FieldExceedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FieldExceedException(String message, Throwable cause) {
		super(message, cause);
	}

	public FieldExceedException(String message) {
		super(message);
	}

	public FieldExceedException(Throwable cause) {
		super(cause);
	}

}
