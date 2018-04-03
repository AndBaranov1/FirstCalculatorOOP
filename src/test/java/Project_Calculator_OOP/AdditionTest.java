package Project_Calculator_OOP;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by 1 on 01.04.2018.
 */
public class AdditionTest {
    @Test
    public void exec() throws Exception {
        Addition addition = new Addition();
        double case1 = addition.exec(154.6, 25.1);
        assertEquals(179.7, case1);
    }
}