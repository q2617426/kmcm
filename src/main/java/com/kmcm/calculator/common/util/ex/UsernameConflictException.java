package com.kmcm.calculator.common.util.ex;

/**
 * 用户名冲突异常，例如：注册时用户名已经被占用
 */
public class UsernameConflictException extends ServiceException {

	private static final long serialVersionUID = -4106401894279090959L;

	public UsernameConflictException() {
		super();
	}

	public UsernameConflictException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UsernameConflictException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsernameConflictException(String message) {
		super(message);
	}

	public UsernameConflictException(Throwable cause) {
		super(cause);
	}

}
