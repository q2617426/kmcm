package com.kmcm.calculator.common.util.ex;

/**
 * 该商品不能支付
 */
public class CanNotPayException extends ServiceException {

	private static final long serialVersionUID = -8881103463792318580L;

	public CanNotPayException() {
		super();
	}

	public CanNotPayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CanNotPayException(String message, Throwable cause) {
		super(message, cause);
	}

	public CanNotPayException(String message) {
		super(message);
	}

	public CanNotPayException(Throwable cause) {
		super(cause);
	}

}
