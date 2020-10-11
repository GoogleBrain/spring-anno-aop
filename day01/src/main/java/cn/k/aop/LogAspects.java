package cn.k.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogAspects {
    @Pointcut("execution(public  int cn.k.aop.MathCal.*(..))")
    public void pointCut(){};

    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName()+"运行了。。。。。，参数列表{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束了。。。。。");
    }

    @AfterReturning(value="pointCut()",returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法正常返回。。。。。，运行结果{}"+result);
    }

    @AfterThrowing(value="pointCut()",throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("除法异常。。。。。，运行结果{}");
    }
}
