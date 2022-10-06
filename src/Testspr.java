import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspr {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationcontext.xml" });

        //Product p = (Product) context.getBean("c");
        User    U   = (User)    context.getBean("u");
        System.out.println(U.getP().getName());
    }
}
