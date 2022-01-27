package com.search.admin.infra.aop;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
@Slf4j
public class RequestLogAspect {

    @Pointcut("execution(public * com.search.admin..*.web.*.*(..))")
    public void execute(){

    }

    @Around("execute()")
    public Object doAround(ProceedingJoinPoint joinPoint){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) requestAttributes;
        String name = joinPoint.getSignature().getName();
        if (ObjectUtils.isEmpty(servletRequestAttributes)){
            log.warn("异步线程调用导致获取不到request信息");
            return null;
        }

        return null;
    }
}
