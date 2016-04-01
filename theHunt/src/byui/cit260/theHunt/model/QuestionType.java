/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Ann
 */
public enum QuestionType implements Serializable {
    riddle,
    water,
    train,
    teaspoon,
    vault,
    empty;
    
    QuestionType() {
        
    }

   
    
}
