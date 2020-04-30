package com.kmcm.calculator.common.util.ex;

/**
 * 更新数据异常
 */
public class UpdateException extends ServiceException {

	private static final long serialVersionUID = 8580917140194657471L;

	public UpdateException() {
		super();
	}

	public UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UpdateException(String message, Throwable cause) {
		super(message, cause);
	}

	public UpdateException(String message) {
		super(message);
	}

	public UpdateException(Throwable cause) {
		super(cause);
	}

}
