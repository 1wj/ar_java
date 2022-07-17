import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class dd {

    @Test
    public void s(){
        System.out.println("hello ");
    }

    @After
    public void after(){
        System.out.println("我是after");
    }

    @Before
    public void brfore(){
        System.out.println("我是before");
    }

}
