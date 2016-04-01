/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Ed White
 */
public class Question implements Serializable{
    //Class instance veriables
    private boolean hasClue;
    private boolean hasTwoTrainSquare;
    private boolean hasTeaspoonSquare;
    private boolean hasWaterSquare;
    private String riddle;
    private String answer;
    private String clue;
    private QuestionType questionType;
    private boolean answered;
    private TeaspoonSquare teaspoonSquare;
    private TwoTrainSquare twoTrainSquare;
    private WaterSquare waterSquare;

    public Question() {
    }
 
    public boolean isHasClue() {
        return hasClue;
    }

    public void setHasClue(boolean hasClue) {
        this.hasClue = hasClue;
    }

    public boolean isHasTwoTrainSquare() {
        return hasTwoTrainSquare;
    }

    public void setHasTwoTrainSquare(boolean hasTwoTrainSquare) {
        this.hasTwoTrainSquare = hasTwoTrainSquare;
    }

    public boolean isHasTeaspoonSquare() {
        return hasTeaspoonSquare;
    }

    public void setHasTeaspoonSquare(boolean hasTeaspoonSquare) {
        this.hasTeaspoonSquare = hasTeaspoonSquare;
    }

    public boolean isHasWaterSquare() {
        return hasWaterSquare;
    }

    public void setHasWaterSquare(boolean hasWaterSquare) {
        this.hasWaterSquare = hasWaterSquare;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean isAnswered) {
        this.answered = isAnswered;
    }

    public TeaspoonSquare getTeaspoonSquare() {
        return teaspoonSquare;
    }

    public void setTeaspoonSquare(TeaspoonSquare teaspoonSquare) {
        this.teaspoonSquare = teaspoonSquare;
    }

    public TwoTrainSquare getTwoTrainSquare() {
        return twoTrainSquare;
    }

    public void setTwoTrainSquare(TwoTrainSquare twoTrainSquare) {
        this.twoTrainSquare = twoTrainSquare;
    }

    public WaterSquare getWaterSquare() {
        return waterSquare;
    }

    public void setWaterSquare(WaterSquare waterSquare) {
        this.waterSquare = waterSquare;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.hasClue ? 1 : 0);
        hash = 53 * hash + (this.hasTwoTrainSquare ? 1 : 0);
        hash = 53 * hash + (this.hasTeaspoonSquare ? 1 : 0);
        hash = 53 * hash + (this.hasWaterSquare ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.riddle);
        hash = 53 * hash + Objects.hashCode(this.answer);
        hash = 53 * hash + Objects.hashCode(this.questionType);
        hash = 53 * hash + (this.answered ? 1 : 0);
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
        final Question other = (Question) obj;
        if (this.hasClue != other.hasClue) {
            return false;
        }
        if (this.hasTwoTrainSquare != other.hasTwoTrainSquare) {
            return false;
        }
        if (this.hasTeaspoonSquare != other.hasTeaspoonSquare) {
            return false;
        }
        if (this.hasWaterSquare != other.hasWaterSquare) {
            return false;
        }
        if (this.answered != other.answered) {
            return false;
        }
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (this.questionType != other.questionType) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "hasClue=" + hasClue + ", hasTwoTrainSquare=" + hasTwoTrainSquare + ", hasTeaspoonSquare=" + hasTeaspoonSquare + ", hasWaterSquare=" + hasWaterSquare + ", riddle=" + riddle + ", answer=" + answer + ", questionType=" + questionType + ", answered=" + answered + '}';
    }    
    
}
