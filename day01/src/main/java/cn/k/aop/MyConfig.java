package cn.k.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class MyConfig {

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

    @Bean
    public MathCal mathCal(){
        return new MathCal();
    }
}
