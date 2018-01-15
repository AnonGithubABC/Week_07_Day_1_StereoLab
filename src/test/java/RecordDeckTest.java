import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sony", "RD1");
    }

    @Test
    public void hasMakeName() {
        assertEquals("Sony", recordDeck.getmakeName());
    }

    @Test
    public void hasModelName() {
        assertEquals("RD1", recordDeck.getmodelName());
    }

    @Test
    public void playMusic(){
        assertEquals("I am Playing A CD", recordDeck.play("CD"));
    }

}
