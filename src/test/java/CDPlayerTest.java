import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;


    @Before
    public void before(){
       cdPlayer = new CDPlayer("Sony", "S1", 6);
    }

    @Test
    public void hasMakeName() {
        assertEquals("Sony", cdPlayer.getmakeName());
    }

    @Test
    public void hasModelName() {
        assertEquals("S1", cdPlayer.getmodelName());
    }

}
