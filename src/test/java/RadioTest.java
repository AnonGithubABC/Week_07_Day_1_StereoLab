import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "Radio 1");
    }

    @Test
    public void radioHasName(){
        assertEquals("Sony", radio.getName());
    }

    @Test
    public void hasStation(){
        assertEquals("Radio 1", radio.getStation());
    }


}
