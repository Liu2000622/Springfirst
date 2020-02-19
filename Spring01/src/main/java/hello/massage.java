package hello;

import org.springframework.stereotype.Component;

@Component//spring容器自动创建对象

public class massage {
    public massage() {
        super();
        System.out.println("massage...");
    }

    public String getmassage() {
        return "hello!";
    }
}
