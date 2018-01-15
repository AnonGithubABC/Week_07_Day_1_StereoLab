import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "R1");
    }


    @Test
    public void hasMakeName() {
        assertEquals("Sony", radio.getmakeName());
    }

    @Test
    public void hasModelName() {
        assertEquals("R1", radio.getmodelName());
    }


    @Test
    public void playMusic(){
        assertEquals("I am Playing A Radio Station", radio.play("Radio Station"));
    }


}
