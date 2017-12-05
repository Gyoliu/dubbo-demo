import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuxing on 2017/12/5.
 */
public class ProviderTest {

    public static void main( String[] args ) throws  Exception
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
        context.start();
        System.out.println(" app run ");
        System.in.read(); // 按任意键退出
    }

}
