/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import byui.cit260.theHunt.control.QuestionControl;
import byui.cit260.theHunt.exceptions.QuestionControlException;
import byui.cit260.theHunt.view.ErrorView;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 *
 * @author Edward White
 */
public class TwoTrainSquare implements Serializable{
    
    //class instance variables
    private final String question;
    private Double answer;
    private final double trainOneSpeed;
    private final double trainTwoSpeed;
    private final double trainOneDistance;
    private final double trainTwoDistance;

    public TwoTrainSquare() {
        DecimalFormat df = new DecimalFormat("###");
        this.trainOneSpeed = Double.valueOf(df.format(Math.random() * 119  + 1));
        this.trainTwoSpeed = Double.valueOf(df.format(Math.random() * 119  + 1));
        this.trainOneDistance = Double.valueOf(df.format(Math.random() * 200  + 1));
        this.trainTwoDistance = Double.valueOf(df.format(Math.random() * 200  + 1));
        this.question = "\n"
                + "Train one is traveling at " + this.trainOneSpeed + " MPH "
                + "and is " + this.trainOneDistance + " miles from the station.\n"
                + "Train two is traveling at " + this.trainTwoSpeed + " MPH "
                + "and is " + this.trainTwoDistance + " miles from the station.\n"
                + "\nHow many total hours will it take for both trains to reach "
                + "the station?\n";
    }

    public Double getAnswer() {
        return answer;
    }

    public void setAnswer(Double answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public double getTrainOneSpeed() {
        return trainOneSpeed;
    }

    public double getTrainTwoSpeed() {
        return trainTwoSpeed;
    }

    public double getTrainOneDistance() {
        return trainOneDistance;
    }

    public double getTrainTwoDistance() {
        return trainTwoDistance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.question);
        hash = 47 * hash + Objects.hashCode(this.answer);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.trainOneSpeed) ^ (Double.doubleToLongBits(this.trainOneSpeed) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.trainTwoSpeed) ^ (Double.doubleToLongBits(this.trainTwoSpeed) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.trainOneDistance) ^ (Double.doubleToLongBits(this.trainOneDistance) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.trainTwoDistance) ^ (Double.doubleToLongBits(this.trainTwoDistance) >>> 32));
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
        final TwoTrainSquare other = (TwoTrainSquare) obj;
        if (Double.doubleToLongBits(this.trainOneSpeed) != Double.doubleToLongBits(other.trainOneSpeed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.trainTwoSpeed) != Double.doubleToLongBits(other.trainTwoSpeed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.trainOneDistance) != Double.doubleToLongBits(other.trainOneDistance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.trainTwoDistance) != Double.doubleToLongBits(other.trainTwoDistance)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TwoTrainSquare{" + "question=" + question + ", answer=" + answer + ", trainOneSpeed=" + trainOneSpeed + ", trainTwoSpeed=" + trainTwoSpeed + ", trainOneDistance=" + trainOneDistance + ", trainTwoDistance=" + trainTwoDistance + '}';
    }
    
}
