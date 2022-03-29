package com.nch.aop.advice;


import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class CustomerBeforeAdvice implements MethodBeforeAdvice {


	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		System.out.println("方法之前执行 ----> BeforeAdvice");

	}
}
