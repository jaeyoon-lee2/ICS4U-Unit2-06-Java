/**
* This class is the superclass of Jet class.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-26
*/
// package ca.mths.unit2.unit06.java.airplane;

public class Airplane {
    /** Private field speed.*/
    private int speed;

    /**
    * Class constructor.
    */
    public Airplane() {
    }

    /**
    * This method returns current speed.
    * @return speed
    */
    public int getSpeed() {
        return this.speed;
    }

    /**
    * This method sets new speed.
    * @param newSpeed
    */
    public void setSpeed(final int newSpeed) {
        this.speed = newSpeed;
    }
}
