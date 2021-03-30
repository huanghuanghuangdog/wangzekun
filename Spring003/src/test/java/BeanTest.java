import cn.bdqn.cn.bdqn.Bean.SpringMainConfig;
import cn.bdqn.cn.bdqn.Bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    @Test //Scope注解单例
    public void testComponentScan() throws Exception{
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);
    }
    @Test //Scope注解多例
    public void testPrototype() throws Exception{

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);

        User user01 = (User) ac.getBean("user");
        User user02 = (User) ac.getBean("user");
    }
    @Test //Lazy注解
    public void testSingleton() throws Exception{

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);
    }
}
