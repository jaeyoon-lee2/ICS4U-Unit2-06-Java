/*
* This class use inheritance.
*
* @author  Jay Lee
* @version 1.0
* @since   2021-05-26
*/
// package ca.mths.unit2.unit06.java.jet;

public class Jet extends Airplane {
    /**
    * The subclass can add its own variable to the ones
    * that it inherits from Airplane.
    */
    private static final int MULTIPLIER = 2;

    /**
    * Super is a special keyword. It refers to the class
    * this class has inherited behavior from.
    * So here, this calls the constructor of Airplane, Jet's superclass.
    */
    public Jet() {
        super();
    }

    /**
    * This method shows that the subclass can change the behavior of
    * its superclass as well as call the superclass's methods.
    * This called overriding the superclass's bahavior.
    * @param speed
    */
    public void setSpeed(final int speed) {
        super.setSpeed(speed * MULTIPLIER);
    }

    /**
    * This method shows that a subclass can add its own
    * methodsto the methods it inherits from its superclass.
    */
    public void accelerate() {
        super.setSpeed(getSpeed() * MULTIPLIER);
    }
}
