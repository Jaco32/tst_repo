/**
 * Created by Jacek_Wegorkiewicz on 25.06.2018.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass2_test {
    @Test
    public void checkSum() {
        TestClass2 testClass = new TestClass2();
        int sum = testClass.add(2, 2);
        assertEquals(4, sum);
    }
}
