import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void hello() {
        HelloWorld hello = new HelloWorld();
        Assert.assertEquals("Hello World", hello.print());
    }
}