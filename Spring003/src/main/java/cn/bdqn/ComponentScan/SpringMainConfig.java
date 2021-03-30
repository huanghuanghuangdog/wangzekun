package cn.bdqn.ComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//includeFilters的作用==指定扫描的时候只需要包含哪些组件。
//excludeFilters的作用==指定扫描的时候按照什么规则排除那些组件。
@Configuration
//@ComponentScan(value = {"cn.bdqn"})
//@ComponentScan(
//        value = {"cn.bdqn"},
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
//                value = {Controller.class})
//        }
//)
@ComponentScan(value = {"cn.bdqn"},
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,
                        value = {Controller.class, Service.class})},
        useDefaultFilters = false
)
public class SpringMainConfig {

}
