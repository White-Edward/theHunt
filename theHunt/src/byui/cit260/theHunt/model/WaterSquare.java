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
 * @author Edward White
 */
public class WaterSquare implements Serializable {
    
    //class instance variable
    private final String question;
    private double answer;
    private final double numOfGallons;
    private final double gallonsPerMinute;
    private final double numOfFills;

    public WaterSquare() {
        DecimalFormat df = new DecimalFormat("###");
        this.numOfGallons = Double.valueOf(df.format(Math.random() * 99 +1));
        this.gallonsPerMinute = Double.valueOf(df.format(Math.random() * 99 +1));
        this.numOfFills = Double.valueOf(df.format(Math.random() * 99 +1)); 
        this.question = "\n"
                + "\n You need to fill a tub with" + this.numOfGallons + "of water."
                + "\n The tub fills at a rate of " + this.gallonsPerMinute + "gallons per minute."
                + "\n You need to fill the tub" + this.numOfFills + "times."
                + "\n How many mintues will it take to fill the tub?";
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

    public double getNumOfGallons() {
        return numOfGallons;
    }

    public double getGallonsPerMinute() {
        return gallonsPerMinute;
    }

    public double getNumOfFills() {
        return numOfFills;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.question);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.numOfGallons) ^ (Double.doubleToLongBits(this.numOfGallons) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.gallonsPerMinute) ^ (Double.doubleToLongBits(this.gallonsPerMinute) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.numOfFills) ^ (Double.doubleToLongBits(this.numOfFills) >>> 32));
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
        final WaterSquare other = (WaterSquare) obj;
        if (Double.doubleToLongBits(this.answer) != Double.doubleToLongBits(other.answer)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfGallons) != Double.doubleToLongBits(other.numOfGallons)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gallonsPerMinute) != Double.doubleToLongBits(other.gallonsPerMinute)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numOfFills) != Double.doubleToLongBits(other.numOfFills)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WaterSquare{" + "question=" + question + ", answer=" + answer + ", numOfGallons=" + numOfGallons + ", gallonsPerMinute=" + gallonsPerMinute + ", numOfFills=" + numOfFills + '}';
    }
    
    
}
