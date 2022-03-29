package com.nch.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CustomerAroundAdvice implements MethodInterceptor {

	@Nullable
	@Override
	public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {

		System.out.println("方法之前执行  ----> AroundAdvice.before");

		// 继续处理
		Object proceed = invocation.proceed();

		System.out.println("方法之后执行 ----> AroundAdvice.after");

		return proceed;
	}
}
