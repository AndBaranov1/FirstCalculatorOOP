package Project_Calculator_OOP;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


/**
 * Created by 1 on 02.04.2018.
 */
public class SubtractionTest {
    @Test
   public void exec() throws Exception {
        Subtraction subtraction = new Subtraction();
        double case1 = subtraction.exec(10, 2.9);
        assertEquals(7.1, case1);
    }
}