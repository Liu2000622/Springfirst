package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class printer {
    private massage ms;

    public printer() {
        super();
        System.out.println("printer...");
    }

    @Autowired//自动调用setMs，建立和massage的关联关系
    public void setMs(massage ms) {
        this.ms = ms;
    }

    public void print() {
        System.out.println(this.ms.getmassage());
    }
}
