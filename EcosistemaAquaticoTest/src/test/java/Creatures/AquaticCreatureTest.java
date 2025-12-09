package Creatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AquaticCreatureTest {

    AquaticCreature ac;

    @BeforeEach
    public void setUp() {
        //Given
        ac = new AquaticCreature(100, 12, "blue") {
            @Override
            public String makesound() {
                return "";
            }
        };
    }

    @Test
    public void moveTest(){
        //When
        ac.move();

        //Then
        assertEquals(98, ac.getEnergy());
    }

     @Test
     public void eatTest(){
        //When
        ac.eat();

         //When
        assertEquals(125, ac.getEnergy());
     }
}
