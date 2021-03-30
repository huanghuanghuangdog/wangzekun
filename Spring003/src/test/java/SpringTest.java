import cn.bdqn.Spring.SpringMainConfig;
import cn.bdqn.Spring.User;
import cn.bdqn.Spring.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    //Bean注解
    @Test
    public void testUser() throws Exception{
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);
        User user = (User) ac.getBean("user01");
        System.out.println(user);
    }

    //如果方法有参数，spring框架会去容器中查找有没有可用的bean对象。查找的方式和Autowired注解的作用是一样的。
    // 即：Spring会从容器中根据类型注入
    @Test
    public void testUser2() throws Exception{

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);
        UserServiceImpl userService = (UserServiceImpl) ac.getBean("userService");
        System.out.println(userService);
    }
}
