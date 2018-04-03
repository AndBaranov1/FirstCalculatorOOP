package Project_Calculator_OOP;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by 1 on 02.04.2018.
 */
public class DivisionTest {
    @Test
    public void exec() throws Exception {
        Division division = new Division();
        double res = division.exec(158, 4);
        assertEquals(39.5, res);
    }
}