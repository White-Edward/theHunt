/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ann
 */
public class QuestionControlTest {
    
    public QuestionControlTest() {
    }

    /**
     * Test of calculateTwoTrains method, of class QuestionControl.
     */
    @Test
    public void testCalculateTwoTrains() {
        /****************
         * Test Case #1
         ****************/
        System.out.println("calculateTwoTrains");
        System.out.println("\tTest Case #1");
        int milesTravelledTrainOne = 150;
        int milesTravelledTrainTwo = 78;
        int milesPerHourTrainOne = 60;
        int milesPerHourTrainTwo = 80;
        QuestionControl instance = new QuestionControl();
        double expResult = 3.48;
        double result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);

        /****************
         * Test Case #2
         ****************/
        System.out.println("\tTest Case #2");
        milesTravelledTrainOne = 0;
        milesTravelledTrainTwo = 78;
        milesPerHourTrainOne = 60;
        milesPerHourTrainTwo = 80;
        expResult = -1;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #3
         ****************/
        System.out.println("\tTest Case #3");
        milesTravelledTrainOne = 150;
        milesTravelledTrainTwo = 245;
        milesPerHourTrainOne = 60;
        milesPerHourTrainTwo = 80;
        expResult = -1;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #4
        ****************/
        System.out.println("\tTest Case #4");
        milesTravelledTrainOne = 150;
        milesTravelledTrainTwo = 78;
        milesPerHourTrainOne = -2;
        milesPerHourTrainTwo = 80;
        expResult = -2;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #5
         ****************/
        System.out.println("\tTest Case #5");
        milesTravelledTrainOne = 150;
        milesTravelledTrainTwo = 78;
        milesPerHourTrainOne = 60;
        milesPerHourTrainTwo = 130;
        expResult = -2;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #6
         ****************/
        System.out.println("\tTest Case #6");
        milesTravelledTrainOne = 1;
        milesTravelledTrainTwo = 1;
        milesPerHourTrainOne = 1;
        milesPerHourTrainTwo = 1;
        expResult = 2;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #7
         ****************/
        System.out.println("\tTest Case #7");
        milesTravelledTrainOne = 200;
        milesTravelledTrainTwo = 200;
        milesPerHourTrainOne = 120;
        milesPerHourTrainTwo = 120;
        expResult = 3.33;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #8
         ****************/
        System.out.println("\tTest Case #8");
        milesTravelledTrainOne = 1;
        milesTravelledTrainTwo = 1;
        milesPerHourTrainOne = 120;
        milesPerHourTrainTwo = 120;
        expResult = 0.02;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    
        /****************
         * Test Case #9
         ****************/
        System.out.println("\tTest Case #9");
        milesTravelledTrainOne = 200;
        milesTravelledTrainTwo = 200;
        milesPerHourTrainOne = 1;
        milesPerHourTrainTwo = 1;
        expResult = 400;
        result = instance.calculateTwoTrains(milesTravelledTrainOne, milesTravelledTrainTwo, milesPerHourTrainOne, milesPerHourTrainTwo);
        assertEquals(expResult, result, 0.01);
    }
}
