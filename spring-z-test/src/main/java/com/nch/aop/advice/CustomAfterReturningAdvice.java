package com.nch.aop.advice;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class CustomAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

		System.out.println("方法返回之后执行--->  after - return");
	}
}
