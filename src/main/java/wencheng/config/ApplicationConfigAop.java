package wencheng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import wencheng.aop.LogAop;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
@Configuration
@ComponentScan(basePackages = "wencheng.aop")
@EnableAspectJAutoProxy
public class ApplicationConfigAop {

    @Bean
    public LogAop logAop(){
        return new LogAop();
    }

}
