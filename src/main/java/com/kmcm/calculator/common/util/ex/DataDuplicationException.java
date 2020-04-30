package com.kmcm.calculator.common.util.ex;

/**
 * 数据重复
 */
public class DataDuplicationException extends ServiceException {

	private static final long serialVersionUID = -8881103463792318580L;

	public DataDuplicationException() {
		super();
	}

	public DataDuplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DataDuplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataDuplicationException(String message) {
		super(message);
	}

	public DataDuplicationException(Throwable cause) {
		super(cause);
	}

}
