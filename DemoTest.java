import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest{
    @Test
    public void countInstanceOfTest(){
        assertEquals(2, Demo.countInstanceOf("Happy Lunar New Year", "e")); //false, should return 2
    }
}
