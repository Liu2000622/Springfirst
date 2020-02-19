package hello;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/*配置类给测试类调用
* */
@Configuration
@ComponentScan(basePackageClasses = {useUser.class,user.class})
public class userConfig {

}
