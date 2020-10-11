package cn.k.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MMM {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        MathCal mathCal = (MathCal) applicationContext.getBean(MathCal.class);
        mathCal.div(1,1);
        applicationContext.close();
    }
}
