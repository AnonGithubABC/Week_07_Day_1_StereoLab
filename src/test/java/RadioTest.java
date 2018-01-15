import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony");
    }

    @Test
    public void radioHasName(){
        assertEquals("Sony", radio.getName());
    }


}
