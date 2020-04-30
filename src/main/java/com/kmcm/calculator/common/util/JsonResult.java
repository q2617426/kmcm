package com.kmcm.calculator.common.util;

import java.io.Serializable;

/**
 * 封装响应的JSON结果的类 新定义
 */
public class JsonResult<T> implements Serializable {

	private static final long serialVersionUID = -3675277270614887834L;
	
	private Integer state;
	private String message;
	private T data;

	public JsonResult() {
		super();
	}

	public JsonResult(Integer state) {
		super();
		this.state = state;
	}

	public JsonResult(Throwable e) {
		super();
		this.message = e.getMessage();
	}

	public JsonResult(Integer state, T data) {
		super();
		this.state = state;
		this.data = data;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
