package com.kmcm.calculator.common.util.ex.controller;



import com.kmcm.calculator.common.util.ex.*;
import com.kmcm.calculator.common.util.JsonResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpSession;


/**
 * 控制器类的基类
 */
public class BaseController {

	/**
	 * 响应成功的标识码
	 */
	public static final int SUCCESS = 200;
	/**
	 * 响应失败的标识码
	 */
	public static final int FAIL = 201;
	/**
	 * 从Session中获取当前登录的用户的id
	 * @param session Session对象
	 * @return 当前登录的用户的id
	 */
	protected Integer getUidFromSession(HttpSession session) {
		return Integer.valueOf(session.getAttribute("uid").toString());
	}
	
	/**
	 * 从Session中获取当前登录的用户名
	 * @param session Session对象
	 * @return 当前登录的用户名
	 */
	protected String getUsernameFromSession(HttpSession session) {
		return session.getAttribute("username").toString();
	}
	
	@ExceptionHandler({ServiceException.class, FileUploadException.class})
	public JsonResult<Void> handleException(Throwable e) {
		JsonResult<Void> jr = new JsonResult<>(e);

		if (e instanceof UsernameConflictException) {
			// 4000-用户名冲突异常，例如：注册时用户名已经被占用
			jr.setState(4000);
		} else if (e instanceof UserNotFoundException) {
			// 4001-用户数据不存在
			jr.setState(4001);
		} else if (e instanceof PasswordNotMatchException) {
			// 4002-验证密码失败
			jr.setState(4002);
		} else if (e instanceof AddressSizeLimitException) {
			// 4003-收货地址的数量达到上限
			jr.setState(4003);
		} else if (e instanceof AddressNotFoundException) {
			// 4004-收货地址数据不存在
			jr.setState(4004);
		} else if (e instanceof AccessDeniedException) {
			// 4005-拒绝访问，例如：尝试访问他人的数据
			jr.setState(4005);
		} else if (e instanceof ProductNotFoundException) {
			// 4006-商品数据不存在
			jr.setState(4006);
		} else if (e instanceof FieldEmptyException) {
			// 4007-字段为空
			jr.setState(4007);
		} else if (e instanceof FieldExceedException) {
			// 4008-数据超过设定值
			jr.setState(4008);
		} else if (e instanceof FieldInsufficientException) {
			// 4009-使用数量不足
			jr.setState(4009);
		} else if (e instanceof LowerThanExceedException) {
			// 4010-数据低于设定值
			jr.setState(4010);
		}   else if (e instanceof InsertException) {
			// 5000-插入数据异常
			jr.setState(5000);
		} else if (e instanceof UpdateException) {
			// 5001-更新数据异常
			jr.setState(5001);
		} else if (e instanceof DeleteException) {
			// 5002-删除数据异常
			jr.setState(5002);
		} else if (e instanceof CanNotPayException) {
			// 5003-改数据不能支付
			jr.setState(5003);
		} else if (e instanceof DataDuplicationException) {
			// 6001-数据重复
			jr.setState(6001);
		}






		return jr;
	}
	
}
