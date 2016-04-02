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
public class TeaspoonSquare implements Serializable {
    
    //class instance variables
    private final String question;
    private double answer;
    private final double containerDivisor;

    public TeaspoonSquare() {
        DecimalFormat df = new DecimalFormat("###");
        this.containerDivisor = Double.valueOf(df.format(Math.random() * 9 +1));
        this.question = "\n"
                + "\n There are 3 teaspoons in a tablespoon and 16 tablespoons in a cup."
                + "\n How many tablespoons would it take to fill a 1/" + this.containerDivisor + "gallon"
                + "\n container if there are 16 cups in a gallon. Round to the nearest whole number.";
    }

    public String getQuestion() {
        return question;
    }

    public double getContainerDivisor() {
        return containerDivisor;
    }

    public double getAnswer() {
        return answer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.question);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.containerDivisor) ^ (Double.doubleToLongBits(this.containerDivisor) >>> 32));
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
        final TeaspoonSquare other = (TeaspoonSquare) obj;
        if (Double.doubleToLongBits(this.containerDivisor) != Double.doubleToLongBits(other.containerDivisor)) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TeaspoonSquare{" + "question=" + question + ", containerDivisor=" + containerDivisor + '}';
    }

}
