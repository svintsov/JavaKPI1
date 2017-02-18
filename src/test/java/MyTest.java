import lab1.Model;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyTest {
    @Test
    public void checkResult(){
        Model model = new Model();
        model.setCoefValue(1.0,3.0,-4.0);
        assertTrue(model.getResult());

        model.setCoefValue(-6.0,-5.0,-1.0);
        assertFalse(model.getResult());

        model.setCoefValue(-6.6,-5.0,-1.3);
        assertFalse(model.getResult());
    }

}
