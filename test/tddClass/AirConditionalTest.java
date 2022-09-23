package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    AirConditional lg;

    @BeforeEach
    void setUp() {
        lg = new AirConditional();
    }

    @Test
    void testThatAcIsOn(){
        assertFalse(lg.isOn());

        lg.turnOn();
        assertTrue(lg.isOn());
    }
}
