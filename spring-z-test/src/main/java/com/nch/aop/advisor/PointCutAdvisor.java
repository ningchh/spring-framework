package com.nch.aop.advisor;

import com.nch.aop.advice.CustomerBeforeAdvice;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class PointCutAdvisor implements PointcutAdvisor {
	@Override
	public Advice getAdvice() {
		return new CustomerBeforeAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	@Override
	public Pointcut getPointcut() {
		return new StaticMethodMatcherPointcut() {
			@Override
			public boolean matches(Method method, Class<?> targetClass) {
				return method.getName().equals("Test");
			}
		};
	}
}
