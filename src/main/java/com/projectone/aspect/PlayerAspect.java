package com.projectone.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class PlayerAspect {

    //TODO log each time a player is created.

    Logger logger = Logger.getLogger(PlayerAspect.class);

    @Before("execution(* createPlayer(..))")
    public void beforeCreatingPlayer(JoinPoint joinPoint)
    {
        logger.info(joinPoint.getSignature());
    }
}
