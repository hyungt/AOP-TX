package com.test.common.Advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Repository;

@Aspect
@Repository
public class AOPLogging {
	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Around("within(com.test.controller..*)")
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureStr = joinPoint.getSignature().toShortString();
		
		logger.info(signatureStr + " �޼ҵ� ����");
		System.out.println(signatureStr + " �޼ҵ� ����");
		try {
			Object obj = joinPoint.proceed();
			return obj;
		} finally {
			logger.info(signatureStr + " �޼ҵ� ��");
			System.out.println(signatureStr + " �޼ҵ� ��");
		}
		
		
	}
}
