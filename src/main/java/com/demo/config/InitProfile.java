package com.demo.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class InitProfile implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		if ("prod".equals(context.getEnvironment().getActiveProfiles()[0])) {
			return true;
		} else {
			return false;
		}
	}

}
