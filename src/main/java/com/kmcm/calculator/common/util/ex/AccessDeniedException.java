package com.kmcm.calculator.common.util.ex;

/**
 * 拒绝访问，例如：尝试访问他人的数据
 */
public class AccessDeniedException extends ServiceException {

	private static final long serialVersionUID = -2146831597708949351L;

	public AccessDeniedException() {
		super();
	}

	public AccessDeniedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccessDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccessDeniedException(String message) {
		super(message);
	}

	public AccessDeniedException(Throwable cause) {
		super(cause);
	}

}
