/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
/**
 *
 * @author Edward
 */
public class Health implements Serializable{
   private  double question;
   private  double health;
   private  double aidBag;
   private  double healthStatus;
   private  double restoredHealth;
   
   public Health() {
       this.health = 100;
       this.question = -10;
       this.healthStatus = this.health - this.question;   
       }
      
   
   
   
   
   
   
   
   
   
   
   
   
   public double healthStaus (){
       if (healthStatus == 90 ) {
         aidBag = 10;
         restoredHealth = healthStatus + aidBag;
        
         if (healthStatus == 80){
                 aidBag = 20;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 70){
                 aidBag = 30;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 60){
                 aidBag = 40;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 50){
                 aidBag = 500;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 40){
                 aidBag = 60;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 30){
                 aidBag = 70;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 20){
                 aidBag = 80;
                 restoredHealth = healthStatus = aidBag;
                 }
         if (healthStatus == 10){
                 aidBag = 90;
                 restoredHealth = healthStatus = aidBag;
                 }
         /*if (healthStatus == 0){
             return ;*/

                 }         
             
             
              return restoredHealth;
       }
       
   }
   
   

