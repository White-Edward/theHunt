/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunt.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ann
 */
public class Constants implements Serializable {
    public final static int NUMBER_OF_ITEMS = 5;
    public final static SimpleRiddle[] RIDDLES = 
    {
        // Source: http://www.funology.com/riddles-page-2/
        new SimpleRiddle(
                "Poor people have it. Rich people need it. If you eat it you die. What is it?", // Riddle
                "Nothing"), // Answer
        new SimpleRiddle(
                "What comes down but never goes up?", // Riddle
                "Rain"), // Answer
        new SimpleRiddle(
                "I’m tall when I’m young and I’m short when I’m old. What am I?", // Riddle
                "candle"), // Answer
        new SimpleRiddle(
                "What goes up when rain comes down?", // Riddle
                "Umbrella"), // Answer
        new SimpleRiddle(
                "What word becomes shorter when you add two letters to it?", // Riddle
                "Short"), // Answer
        new SimpleRiddle(
                "What travels around the world but stays in one spot?", // Riddle
                "Stamp"), // Answer
        new SimpleRiddle(
                "What has 4 eyes but can’t see?", // Riddle
                "Mississippi"), // Answer
        new SimpleRiddle(
                "If I have it, I don’t share it. If I share it, I don’t have it. What is it?", // Riddle
                "Secret"), // Answer
        new SimpleRiddle(
                "What has hands but cannot clap?", // Riddle
                "Clock"), // Answer
        new SimpleRiddle(
                "What can you catch but not throw?", // Riddle
                "Cold"), // Answer
        new SimpleRiddle(
                "What starts with the letter “t”, is filled with “t” and ends in “t”?", // Riddle
                "Teapot"), // Answer
        new SimpleRiddle(
                "What is so delicate that saying its name breaks it?", // Riddle
                "Silence"), // Answer
        new SimpleRiddle(
                "You walk into a room with a match, a karosene lamp, a candle, and a fireplace. Which do you light first?", // Riddle
                "Match"), // Answer
        new SimpleRiddle(
                "What has one eye but cannot see?", // Riddle
                "Needle"), // Answer
        new SimpleRiddle(
                "How many months have 28 days?", // Riddle
                "12"), // Answer
        new SimpleRiddle(
                "We see it once in a year, twice in a week, and never in a day. What is it?", // Riddle
                "E"), // Answer
        new SimpleRiddle(
                "What goes up but never comes down?", // Riddle
                "Age"), // Answer
        new SimpleRiddle(
                "What is always coming but never arrives?", // Riddle
                "Tomorrow"), // Answer
        new SimpleRiddle(
                "What goes through towns and over hills but never moves?", // Riddle
                "Road"), // Answer
        new SimpleRiddle(
                "What has Eighty-eight keys but can’t open a single door?", // Riddle
                "Piano"), // Answer
        new SimpleRiddle(
                "What has a neck but no head?", // Riddle
                "Bottle"), // Answer
        new SimpleRiddle(
                "What has a head but never weeps, has a bed but never sleeps, can run but never walks, and has a bank but no money?", // Riddle
                "River"), // Answer
        new SimpleRiddle(
                "The more it dries, the wetter it becomes. What is it?", // Riddle
                "Towel"), // Answer
        // Source: http://www.rd.com/jokes/riddles/
        new SimpleRiddle(
                "What do you call a bear without an ear?", // Riddle
                "B"), // Answer
        new SimpleRiddle(
                "What do you break before you use it?", // Riddle
                "Egg"), // Answer
        new SimpleRiddle(
                "What is the most curious letter?", // Riddle
                "Y"), // Answer
    };
    
}
