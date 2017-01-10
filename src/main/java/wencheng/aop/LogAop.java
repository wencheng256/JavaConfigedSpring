package wencheng.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
@Aspect
public class LogAop {

    @Pointcut("execution(* wencheng.mvc.IndexController.index())")
    public void point(){}

    @Around("point()")
    public void log(ProceedingJoinPoint joinPoint){
        System.out.println("begin");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("end");
    }

}
