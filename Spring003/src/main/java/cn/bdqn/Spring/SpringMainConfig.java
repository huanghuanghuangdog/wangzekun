package cn.bdqn.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//当前类是一个配置类,该类的作用和beans.xml是一样的
@Configuration
public class SpringMainConfig {
    // 给容器中注册一个bean;类型为方法返回值的类型，默认方法名作为id，即bean的名字默认是方法名
    // 可以再注册Bean的同时，不用方法名作为id,可以指定bean的名称。
    @Bean("user01")
    public User user(){
        return new User(1,"黄鹏套");
    }

    // 给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean
    public UserServiceImpl userService(@Qualifier("userDao01") UserDao userDao){
        //不能自动注入，容器中有不止一个userDAO
        //解决方法一修改参数名称
        return new UserServiceImpl(userDao);
    }

    @Bean
    public UserDao userDao01(){
        return new UserDaoImpl01();
    }

    @Bean
    public UserDao userDao02(){
        return new UserDaoImpl02();
    }
}
