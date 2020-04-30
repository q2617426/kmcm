package com.kmcm.calculator.common.util.ex;

/**
 * 数据小于设定值
 */
public class LowerThanExceedException extends ServiceException {

	private static final long serialVersionUID = -8881103463792318580L;

	public LowerThanExceedException() {
		super();
	}

	public LowerThanExceedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LowerThanExceedException(String message, Throwable cause) {
		super(message, cause);
	}

	public LowerThanExceedException(String message) {
		super(message);
	}

	public LowerThanExceedException(Throwable cause) {
		super(cause);
	}

}
