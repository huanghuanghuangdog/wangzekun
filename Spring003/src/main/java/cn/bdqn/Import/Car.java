package cn.bdqn.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
    @Bean
    public AuDi auDi(){
        return new AuDi();
    }

    @Bean
    public BMW bmw(){
        return new BMW();
    }
}
