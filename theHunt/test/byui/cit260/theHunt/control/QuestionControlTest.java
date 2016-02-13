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
        System.out.println("calculateTwoTrains (team assignment)");
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

    /**
     * Test of calculateCostOfTrip method, of class QuestionControl.
     * Ann Lloyd's individual assignment
     */
    @Test
    public void testCalculateCostOfTrip() {
        System.out.println("calculateCostOfTrip (Ann Lloyd's individual assignment)");
        
        /****************
         * Test Case #1
         ****************/
        System.out.println("\tTest Case #1");
        double milesTravelled = 150;
        double gasPrice = 1.50;
        double fuelEfficiency = 30;
        QuestionControl instance = new QuestionControl();
        double expResult = 7.5;
        double result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #2
         ****************/
        System.out.println("\tTest Case #2");
        milesTravelled = 0;
        gasPrice = 78;
        fuelEfficiency = 60;
        expResult = -1;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #3
         ****************/
        System.out.println("\tTest Case #3");
        milesTravelled = 150;
        gasPrice = 0;
        fuelEfficiency = 60;
        expResult = -2;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #4
         ****************/
        System.out.println("\tTest Case #4");
        milesTravelled = 150;
        gasPrice = 78;
        fuelEfficiency = 0;
        expResult = -3;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #5
         ****************/
        System.out.println("\tTest Case #5");
        milesTravelled = 1;
        gasPrice = 0.01;
        fuelEfficiency = 1;
        expResult = 0.01;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #6
         ****************/
        System.out.println("\tTest Case #6");
        milesTravelled = 1;
        gasPrice = 10;
        fuelEfficiency = 100;
        expResult = 0.1;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #7
         ****************/
        System.out.println("\tTest Case #7");
        milesTravelled = 1000;
        gasPrice = 0.01;
        fuelEfficiency = 30;
        expResult = 0.33;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
        
        /****************
         * Test Case #8
         ****************/
        System.out.println("\tTest Case #8");
        milesTravelled = 100;
        gasPrice = 5;
        fuelEfficiency = 1;
        expResult = 500;
        result = instance.calculateCostOfTrip(milesTravelled, gasPrice, fuelEfficiency);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calculateTeaspoon method, of class QuestionControl.
     */
    @Test
    public void testCalculateTeaspoon() {
        System.out.println("calculateTeaspoon (Ryan Funderburk's Individual Assignment)");
         /****************
         * Test Case #1
         ****************/
        System.out.println("\tTest Case #1");
        double containerDivisor = 2.0;
        double userAnswer = 768.0;
        QuestionControl instance = new QuestionControl();
        char expResult = 't';
        char result = instance.calculateTeaspoon(containerDivisor, userAnswer);
        assertEquals(expResult, result, 0.0001);
        
             /****************
         * Test Case #2
         ****************/
        System.out.println("\tTest Case #2");
        containerDivisor = 2.0;
        userAnswer = 768;
        expResult = 't';
        result = instance.calculateTeaspoon(containerDivisor, userAnswer);
        assertEquals(expResult, result, 0.0001);
        
                     /****************
         * Test Case #3
         ****************/
        System.out.println("\tTest Case #3");
        containerDivisor = 2.0;
        userAnswer = 768.1;
        expResult = 't';
        result = instance.calculateTeaspoon(containerDivisor, userAnswer);
        assertEquals(expResult, result, 0.0001);
        
                     /****************
         * Test Case #4
         ****************/
        System.out.println("\tTest Case #4");
        containerDivisor = 2.0;
        userAnswer = 767.99;
        expResult = 't';
        result = instance.calculateTeaspoon(containerDivisor, userAnswer);
        assertEquals(expResult, result, 0.0001);
        
                     /****************
         * Test Case #5
         ****************/
        System.out.println("\tTest Case #5");
        containerDivisor = 2.0;
        userAnswer = -768.0;
        expResult = 't';
        result = instance.calculateTeaspoon(containerDivisor, userAnswer);
        assertEquals(expResult, result, 0.0001);

    }

    /**
     * Test of calculateWater method, of class QuestionControl.
     */
    @Test
    public void testCalculateWater() {
        System.out.println("calculateWater (Edward White's Individual Assignment)");
        
          
        /****************
         * Test Case #1
         ****************/   
        System.out.println("\tTest Case #1");
        double numOfGallons = 40;
        double gallonsPerMinute = 2;
        double numOfFills = 2;
        QuestionControl instance = new QuestionControl();
        double expResult = 40;
        double result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);
        
        /****************
         * Test Case #2
         ****************/    
        System.out.println("\tTest Case #2");
        numOfGallons = 40;
        gallonsPerMinute = 2;
        numOfFills = -1;
        expResult = -1;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);
        
        /****************
         * Test Case #3
         ****************/    
        System.out.println("\tTest Case #3");
        numOfGallons = 1;
        gallonsPerMinute = -2;
        numOfFills = 1;
        expResult = -1;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);

        /****************
         * Test Case #4
         ****************/    
        System.out.println("\tTest Case #4");
        numOfGallons = 40;
        gallonsPerMinute = -3;
        numOfFills = 1;
        expResult = -1;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);

        /****************
         * Test Case #5
         ****************/    
        System.out.println("\tTest Case #5");
        numOfGallons = 100;
        gallonsPerMinute = 100;
        numOfFills = 100;
        expResult = 100;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);
        
         /****************
         * Test Case #6
         ****************/    
        System.out.println("\tTest Case #6");
        numOfGallons = 100;
        gallonsPerMinute = 100;
        numOfFills = 1;
        expResult = 1;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);
        
        /****************
         * Test Case #7
         ****************/    
        System.out.println("\tTest Case #7");
        numOfGallons = 1;
        gallonsPerMinute = 100;
        numOfFills = 100;
        expResult = 1;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);

        /****************
         * Test Case #8
         ****************/    
        System.out.println("\tTest Case #8");
        numOfGallons = 100;
        gallonsPerMinute = 1;
        numOfFills = 100;
        expResult = 10000;
        result = instance.calculateWater(numOfGallons, gallonsPerMinute, numOfFills);
        assertEquals(expResult, result, 0.0);        
       
    }
}
