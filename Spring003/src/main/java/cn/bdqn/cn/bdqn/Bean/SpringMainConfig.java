package cn.bdqn.cn.bdqn.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringMainConfig {
//    @Bean
//    @Scope("prototype")
//    public User user(){
//        System.out.println("对象创建");
//        return new User(1,"HelloWorld");
//    }
    @Bean
    @Lazy(value = true)	// 开启懒加载
    public User user(){
        System.out.println("对象创建啦");
        return new User(1,"HelloWorld");
    }
}
