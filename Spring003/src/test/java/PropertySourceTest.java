import cn.bdqn.PropertySource.Pig;
import cn.bdqn.PropertySource.SpringMainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {
    @Test
    public void testPig() throws Exception{

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);

        Pig pig = (Pig) ac.getBean("pig");

        System.out.println(pig);	// 1,name
    }
}
