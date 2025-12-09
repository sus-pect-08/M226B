package Creatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PredatorTest {
    Predator predator;

    @Test
    public void successfulHuntTest(){
        //Given
        predator = new Predator(100, 10, "blue", 100, 100) {
            @Override
            public String makesound() {
                return "";
            }
        };

        //Then
        assertTrue(predator.hunt());
    }

    @Test
    public void unsuccessfulHuntTest(){
        //Given
        predator = new Predator(1, 2, "blue", 0, 0) {
            @Override
            public String makesound() {
                return "";
            }
        };

        //Then
        assertFalse(predator.hunt());
    }
}
