package com.nch.aop.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class CustomThrowsAdvice implements ThrowsAdvice {

	/**
	 * 实现throwAdvice没有接口，是因为需要返回异常类型，太灵活了
	 * 详情见：ThrowsAdviceInterceptor
	 */

	public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {

		System.out.println("发生异常了 ---->  throwsAdvice");
	}

}
