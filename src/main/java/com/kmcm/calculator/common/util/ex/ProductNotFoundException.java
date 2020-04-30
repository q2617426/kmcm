package com.kmcm.calculator.common.util.ex;

/**
 * 商品数据不存在
 */
public class ProductNotFoundException extends ServiceException {

	private static final long serialVersionUID = -3688349481224653582L;

	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductNotFoundException(String message) {
		super(message);
	}

	public ProductNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
