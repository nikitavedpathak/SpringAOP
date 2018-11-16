package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAOP {

	public Object loggerAop (ProceedingJoinPoint joinpoint) throws Throwable
	{

		String signature = joinpoint.getSignature().toShortString();
		System.out.println("Method is: "+ signature + "start");
		long starttime = System.currentTimeMillis();

		try {

			Object object = joinpoint.proceed();
			return object;

		}finally
		{
			long endtime = System.currentTimeMillis();
			System.out.println("Elapsed time is : "+ (endtime - starttime));

		}
	

	}



}
