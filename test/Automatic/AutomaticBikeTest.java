package Automatic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {

    @Test
    @DisplayName("When the Bike is turned Off, and I set the Bike On, Turn Bike On ")
    public void WhenTheBikeIsTurnedOffAndISetTheBikeOnTurnBikeOn(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.setOn(true);
        //check
        assertTrue(honda.isOn());
    }

    @Test
    @DisplayName("When the Bike is turned on, and I set the Bike Off, Turn Bike Off ")
    public void WhenTheBikeIsTurnedOnAndISetTheBikeOffTurnBikeOff(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.setOn(false);
        //check
        assertTrue(honda.isOn());
    }

    @Test
    void toIncreaseAccelerationByOne(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.increaseSpeed(17);
        //given
        assertEquals(18 , honda.getSpeed());

    }

    @Test
    void toIncreaseAccelerationByTwo(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.increaseSpeed(23);
        //given
        assertEquals(25 , honda.getSpeed());

    }
    @Test
    void toIncreaseAccelerationByThree(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.increaseSpeed(31);
        //given
        assertEquals(34 , honda.getSpeed());

    }

    @Test
    void toIncreaseAccelerationByFour(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.increaseSpeed(41);
        //given
        assertEquals(45 , honda.getSpeed());

    }

    @Test
    void toDecreaseAccelerationByOne(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.decreaseSpeed(11);
        //given
        assertEquals(10 , honda.getSpeed());

    }

    @Test
    void toDecreaseAccelerationByTwo(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.decreaseSpeed(23);
        //given
        assertEquals(21 , honda.getSpeed());

    }
    @Test
    void toDecreaseAccelerationByThree(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.decreaseSpeed(35);
        //given
        assertEquals( 32, honda.getSpeed());

    }

    @Test
    void toDecreaseAccelerationByFour(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.decreaseSpeed(48);
        //given
        assertEquals( 44, honda.getSpeed());

    }

    @Test
    void gearOneSpeedRange(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.gearMax(16);
        //given
        assertEquals( "Gear 1", honda.getGearMax());

    }

    @Test
    void gearTwoSpeedRange(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.gearMax(25);
        //given
        assertEquals( "Gear 2", honda.getGearMax());

    }

    @Test
    void gearThreeSpeedRange(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.gearMax(35);
        //given
        assertEquals( "Gear 3", honda.getGearMax());

    }
    @Test
    void gearFourSpeedRange(){
        //given
        AutomaticBike honda = new AutomaticBike();
        //when
        honda.gearMax(51);
        //given
        assertEquals( "Gear 4", honda.getGearMax());

    }
}

