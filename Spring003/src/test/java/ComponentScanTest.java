import cn.bdqn.ComponentScan.SpringMainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    @Test
    public void testComponentScan() throws Exception{

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);

        // 获取Spring容器中已经注册好的bean,把所有bean的名字获取出来
        String[] names = ac.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }
}
