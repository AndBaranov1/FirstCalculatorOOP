package Project_Calculator_OOP;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by 1 on 02.04.2018.
 */
public class MultiplyTest {
    @Test
    public void exec() throws Exception {
        Multiply multiply = new Multiply();
        double case1 = multiply.exec(22, 8);
        assertEquals(176.0, case1);
    }
}