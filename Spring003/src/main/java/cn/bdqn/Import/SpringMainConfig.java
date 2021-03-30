package cn.bdqn.Import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(value = {Dog.class})
@Import(value={Car.class})
public class SpringMainConfig {
}
