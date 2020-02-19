package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = userConfig.class)
public class TestUser {
    //@Autowired
    // @Qualifier("normal")
    @Resource(name = "useUser")//同时替代上面两句话
    private useUser uu;

    @Test
    public void test() {
        uu.add();
    }
}
