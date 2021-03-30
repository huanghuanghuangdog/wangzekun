package cn.bdqn.PropertySource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //主配置类
@ComponentScan("cn.bdqn") // 扫描包，目的是能够扫描到Pig类
@PropertySource(value = {"Pig.properties"}) //加载配置文件
public class SpringMainConfig {
    public Pig pig;
}
