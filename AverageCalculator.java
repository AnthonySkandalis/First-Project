import java.io.*;
import java.util.*;
import java.text.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Object;
import java.util.Objects;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Thread;
/**
 * Provides needed methods for the calculation of the average values of the attributes for all the cards so that the computer is able to play.
 * 
 * @author Antonios Skandalis
 * @version 1.0
 */
public class AverageCalculator
{

    public AverageCalculator(ArrayList<Card> cards){
    }

    /**
     * 
     * Calculates the average magic attribute for all cards.
     * 
     * @param cards The ArrayList named cards which has all the cards for the game stored.
     * 
     */
    public static int avMagicCalc(ArrayList<Card> cards){
        int avMagic = 0;
        for (int i = 0; i < cards.size(); i++){
            avMagic = avMagic + cards.get(i).magic;
        }
        avMagic = (int)(avMagic / cards.size());

        return avMagic;
    }

    /**
     * 
     * Calculates the average speed attribute for all cards.
     * 
     * @param cards The ArrayList named cards which has all the cards for the game stored.
     * 
     */
    public static int avSpeedCalc(ArrayList<Card> cards){
        int avSpeed = 0;
        for (int i = 0; i < cards.size(); i++){
            avSpeed = avSpeed + cards.get(i).speed;
        }
        avSpeed = (int)(avSpeed / cards.size());

        return avSpeed;
    }

    /**
     * 
     * Calculates the average lethality attribute for all cards.
     * 
     * @param cards The ArrayList named cards which has all the cards for the game stored.
     * 
     */
    public static int avLethalityCalc(ArrayList<Card> cards){
        int avLethality = 0;
        for (int i = 0; i < cards.size(); i++){
            avLethality = avLethality + cards.get(i).lethality;
        }
        avLethality = (int)(avLethality / cards.size());

        return avLethality;
    }

    /**
     * 
     * Calculates the average strength attribute for all cards.
     * 
     * @param cards The ArrayList named cards which has all the cards for the game stored.
     * 
     */
    public static int avStrengthCalc(ArrayList<Card> cards){
        int avStrength = 0;
        for (int i = 0; i < cards.size(); i++){
            avStrength = avStrength + cards.get(i).strength;
        }
        avStrength = (int)(avStrength / cards.size());

        return avStrength;
    }

    /**
     * 
     * Calculates the average morality attribute for all cards.
     * 
     * @param cards The ArrayList named cards which has all the cards for the game stored.
     * 
     */
    public static int avMoralityCalc(ArrayList<Card> cards){
        int avMorality = 0;
        for (int i = 0; i < cards.size(); i++){
            avMorality = avMorality + cards.get(i).morality;
        }
        avMorality = (int)(avMorality / cards.size());

        return avMorality;
    }
}
