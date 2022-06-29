package Automatic;

public class AutomaticBike {
    private boolean isOn;
    private int speed;

    private String gear;

    public void setOn(boolean b) {
        if (this.isOn = true) ;
    }

    public boolean isOn() {
        if (this.isOn == true) {
            return true;
        } else {
            return false;
        }

    }

    public void increaseSpeed(int speed) {
        if (speed >= 0 && speed <= 20) {
            this.speed = speed + 1;
        }
        if (speed >= 21 && speed <= 30) {
            this.speed = speed + 2;
        }
        if (speed >= 31 && speed <= 40) {
            this.speed = speed + 3;
        }
        if (speed >= 41) {
            this.speed = speed + 4;
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void decreaseSpeed(int speed) {
        if (speed >= 0 && speed <= 20) {
            this.speed = speed - 1;
        }

        if (speed >= 21 && speed <= 30) {
            this.speed = speed - 2;
        }

        if (speed >= 31 && speed <= 40) {
            this.speed = speed - 3;
        }
        if (speed >= 41) {
            this.speed = speed - 4;
        }
    }

    public void gearMax(int speed) {
        if (speed >= 0 && speed < 20) {
            gear = "Gear 1";
        } else if (speed >= 21 && speed <= 30) {
            gear = "Gear 2";
        } else if (speed >= 31 && speed <= 40) {
            gear = "Gear 3";
        } else { gear = "Gear 4";
        }
    }
        public String getGearMax() {
            return gear;
        }
    }

