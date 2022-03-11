package com.projectone.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;

@Component
@Aspect
public class EnemyAspect {

    Logger logger = Logger.getLogger(EnemyAspect.class);

    @Before("execution(* createEnemy(..))")
    public void beforeCreatingEnemy(JoinPoint joinPoint)
    {
        logger.info(joinPoint.getSignature());
    }

}
