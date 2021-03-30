import cn.bdqn.Import.SpringMainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
    @Test
    //，Import注解可以去修饰常规组件类，意思是：所谓的常规组件类就是一个普通的Java类，
    // 而如果这个普通的Java类被@Import注解修饰，那么也可以将这个Java类注册到Spring容器中，成为Bean。
    public void testDogBean() throws Exception{

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringMainConfig.class);
        // 查看Spring容器中所有注册的Bean
        String[] names = ac.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }
}
