import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) context.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) context.getBean("helloworld");
        System.out.println(bean == bean1);
        System.out.println(bean.getMessage());

        Cat cat1 = (Cat) context.getBean("cat");
        System.out.println(cat1.getCatSound());
        Cat cat2 = (Cat) context.getBean("cat");
        System.out.println(cat1 == cat2);

    }
}