package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = configer.class)//导入配置文件的class
public class apptest {
    @Autowired
    private printer pr;
    @Test
    public void testplay(){
        //初始化spring容器
        //ApplicationContext context = new AnnotationConfigApplicationContext(configer.class);
        //获取bean对象
       // printer pr = context.getBean(printer.class);
        //massage ma=context.getBean(massage.class);
        //System.out.println(pr);
        //System.out.print(ma);
        // pr.setMs(ma);自动调用
        //通过spring管理bean
        if (pr != null) {
            pr.print();
        }

    }
}
