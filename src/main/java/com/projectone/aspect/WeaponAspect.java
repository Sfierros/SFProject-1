package com.projectone.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class WeaponAspect {

    Logger logger = Logger.getLogger(WeaponAspect.class);

    @Before("execution(* createWeapon(..))")
    public void beforeCreatingWeapon(JoinPoint joinPoint)
    {
        logger.info(joinPoint.getSignature());
    }
}
