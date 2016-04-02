/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 *
 * @author Ann
 */
public class TripSquare implements Serializable {
    
    private final String question;
    private double answer;
    private final double milesTravelled;
    private final double gasPrice;
    private final double fuelEfficiency;
    
    public TripSquare() {
        DecimalFormat df = new DecimalFormat("###");
        this.milesTravelled = Double.valueOf(df.format(Math.random() * 999  + 1)); // 1 - 1000 miles
        this.gasPrice = Double.valueOf(df.format(Math.random() * 9.99  + 0.01)); // 0.01 to 10.00 dollars
        this.fuelEfficiency = Double.valueOf(df.format(Math.random() * 99  + 1)); // 1 - 100 MPG
        this.question = "\n"
                + "How much does it cost to drive a car " + this.milesTravelled 
                + " miles when gas cost $" + this.gasPrice + " per gallon and the car\n" 
                + "has a fuel efficiency of " + this.fuelEfficiency + " MPG?\n";
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public double getMilesTravelled() {
        return milesTravelled;
    }

    public double getGasPrice() {
        return gasPrice;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.question);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.milesTravelled) ^ (Double.doubleToLongBits(this.milesTravelled) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.gasPrice) ^ (Double.doubleToLongBits(this.gasPrice) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.fuelEfficiency) ^ (Double.doubleToLongBits(this.fuelEfficiency) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TripSquare other = (TripSquare) obj;
        if (Double.doubleToLongBits(this.answer) != Double.doubleToLongBits(other.answer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.milesTravelled) != Double.doubleToLongBits(other.milesTravelled)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gasPrice) != Double.doubleToLongBits(other.gasPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelEfficiency) != Double.doubleToLongBits(other.fuelEfficiency)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TripSquare{" + "question=" + question + ", answer=" + answer + ", milesTravelled=" + milesTravelled + ", gasPrice=" + gasPrice + ", fuelEfficiency=" + fuelEfficiency + '}';
    }

}
