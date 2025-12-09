package Creatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DolphinTest {

    Dolphin dolphin;

    @BeforeEach
    public void setUp() {
        //Given
        dolphin = new Dolphin(100, 3, "bifala", 100, 100, 100);
    }

    @Test
    public void makesoundTest(){
        //When
        String expected = "ghghgh";
        String actual = dolphin.makesound();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void huntTest(){
        //Then
        assertTrue(dolphin.hunt());
    }

}
