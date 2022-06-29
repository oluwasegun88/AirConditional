package AirConditionalTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcTesting {
    @Test
    @DisplayName("When AC is off,i pressed on button")
    public void whenAcIsOffIPressedOnButton() {
        //given
        AirConditional hisense = new AirConditional();
        //when
        hisense.setOn(true);
        //check
        assertTrue(hisense.isOn());
    }


    @Test
    @DisplayName("When AC is on,i pressed off button")
    public void whenAcIsOnIPressedOffButton() {
        //given
        AirConditional hisense = new AirConditional();
        //when
        hisense.setOn(false);
        //check
        assertTrue(hisense.isOn());
    }


    @Test
    @DisplayName("When I increases the temperature, the temperature increases")
    public void whenIIncreasesTheTemperatureTheTemperatureIncreases() {
        //given
        AirConditional hisense = new AirConditional();
        //when
        hisense.setIncreases(true);
        //check
        assertTrue(hisense.isIncreases());
    }


    @Test
    @DisplayName("When I decreases the temperature, the temperature decreases")
    public void whenIDecreasesTheTemperatureTheTemperatureDecreases() {
        //given
        AirConditional hisense = new AirConditional();
        //when
        hisense.setDecreases(false);
        //check
        assertTrue(hisense.isDecreases());
    }

    @Test
    @DisplayName("When I increases the temperature, the temperature remain constant")
    public void whenIIncreasesTheTemperatureTheTemperatureRemainConstant() {
        //given
        AirConditional hisense = new AirConditional();
        //when
        hisense.setIncreasesConstant(true);
        //check
        assertTrue(hisense.isIncreasesConstant());
    }

    @Test
    @DisplayName("When I decreases the temperature, the temperature remain stable")
    public void whenIDecreasesTheTemperatureTheTemperatureRemainStable() {
        //given
        AirConditional hisense = new AirConditional();
        //when
        hisense.setDecreasesStable(true);
        //check
        assertTrue(hisense.isDecreasesStable());
    }
}