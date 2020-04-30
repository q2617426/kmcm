package com.kmcm.calculator.common.util.ex;

/**
 * 数据为空
 */
public class FieldEmptyException extends ServiceException {

	private static final long serialVersionUID = -8881103463792318580L;

	public FieldEmptyException() {
		super();
	}

	public FieldEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FieldEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public FieldEmptyException(String message) {
		super(message);
	}

	public FieldEmptyException(Throwable cause) {
		super(cause);
	}

}
