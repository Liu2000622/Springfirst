package hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier
public class useUser implements user {
    @Override
    public void add() {
        System.out.println("测试用户");
    }
}
