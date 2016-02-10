/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.control;

/**
 *
 * @author Ann
 */
public class QuestionControl {
    
    public double calculateTwoTrains(double milesTravelledTrainOne, double milesTravelledTrainTwo, double milesPerHourTrainOne, double milesPerHourTrainTwo) {
//    BEGIN
//    IF (milesTravelledTrainOne < 1 OR milesTravelledTrainOne > 200) THEN
//            RETURN -1
//    IF (milesTravelledTrainTwo < 1 OR milesTravelledTrainTwo > 200) THEN
//            RETURN -1
//    IF (milesPerHourTrainOne < 1 OR milesPerHourTrainOne > 120) THEN
//            RETURN -2
//    IF (milesPerHourTrainTwo < 1 OR milesPerHourTrainTwo > 120) THEN
//            RETURN -2
//    hoursTrainOne = milesTravelledTrainOne / milesPerHourTrainOne
//    hoursTrainTwo = milesTravelledTrainTwo / milesPerHourTrainTwo
//    hours = ROUND(hoursTrainOne + hoursTrainTwo)
//    RETURN hours
//    END
        if (milesTravelledTrainOne < 1 || milesTravelledTrainOne > 200) {
            return -1;
        }
        if (milesTravelledTrainTwo < 1 || milesTravelledTrainTwo > 200) {
            return -1;
        }
        if (milesPerHourTrainOne < 1 || milesPerHourTrainOne > 120) {
            return -2;
        }
        if (milesPerHourTrainTwo < 1 || milesPerHourTrainTwo > 120) {
            return -2;
        }
        double hoursTrainOne = milesTravelledTrainOne / milesPerHourTrainOne;
        double hoursTrainTwo = milesTravelledTrainTwo / milesPerHourTrainTwo;
        double hours = hoursTrainOne + hoursTrainTwo;
        return hours;
    }
}
