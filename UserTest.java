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
 * One method class that runs in the beginning of the game and whenever the user wins a card from the opponent.
 * Checks wether the game is already over by checking the sizes of each players hand.
 * Uses a scanner to take the user input on what to compare.
 * Compares the attribute with the computer and runs the according method.
 * 
 * @author Antonios Skandalis, Nuria Cano Girones
 * @version 1.0
 */
public class UserTest
{

    public UserTest(ArrayList<Card> userCards,ArrayList<Card> pcCards, ArrayList<Card> cards, int avMagic, int avSpeed, int avLethality, int avStrength, int avMorality){
        testing(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
    }

    /**
     * Method for the automation of the user player.
     * 
     * @param userCards The ArrayList storing the cards of the user player.
     * @param pcCards The ArrayList storing the cards of the computer player.
     * @param cards The ArrayList storing all the cards.
     * @param avMagic Int variable for average magic attribute.
     * @param avSpeed Int variable for average speed attribute.
     * @param avLethality Int variable for average lethality attribute.
     * @param avStrength Int variable for average strength attribute.
     * @param avMorality Int variable for average morality attribute.
     * 
     */
    public void testing(ArrayList<Card> userCards,ArrayList<Card> pcCards, ArrayList<Card> cards, int avMagic, int avSpeed, int avLethality, int avStrength, int avMorality){

        while (userCards.size() != 0 && pcCards.size() != 0){
            System.out.println("\nThis is your next card: \n"+userCards.get(0));

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }

            Scanner reader = new Scanner(System.in);
            System.out.println("\nWhat is your choice? Magic, Speed, Lethality, Strength or Morality?");
            String comparator = reader.nextLine();
            if ((comparator.equals("Magic")) || (comparator.equals("magic"))){
                if(userCards.get(0).magic > pcCards.get(0).magic){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour " + userCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou won " + pcCards.get(0).name + " from your opponent!");
                    userCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    userCards.add(userCards.get(0));
                    userCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                }
                else if(userCards.get(0).magic < pcCards.get(0).magic){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent's " + pcCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent took " + userCards.get(0).name + " from you.");
                    pcCards.add(userCards.get(0));
                    userCards.remove(0);
                    pcCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    pcPlay pcPlayer = new pcPlay(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
                }
                else{
                    System.out.println("\nNo one wins. Please try a different attribute.");
                }
            }
            else if((comparator.equals("Speed")) || (comparator.equals("speed"))){
                if(userCards.get(0).speed > pcCards.get(0).speed){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour " + userCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou won " + pcCards.get(0).name + " from your opponent!");
                    userCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    userCards.add(userCards.get(0));
                    userCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                }
                else if(userCards.get(0).speed < pcCards.get(0).speed){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent's " + pcCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent took " + userCards.get(0).name + " from you.");
                    pcCards.add(userCards.get(0));
                    userCards.remove(0);
                    pcCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    pcPlay pcPlayer = new pcPlay(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
                }
                else{
                    System.out.println("\nNo one wins. Please try a different attribute.");
                }
            }
            else if((comparator.equals("Lethality")) || (comparator.equals("lethality"))){
                if(userCards.get(0).lethality > pcCards.get(0).lethality){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour " + userCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou won " + pcCards.get(0).name + " from your opponent!");
                    userCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    userCards.add(userCards.get(0));
                    userCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                }
                else if(userCards.get(0).lethality < pcCards.get(0).lethality){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent's " + pcCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent took " + userCards.get(0).name + " from you.");
                    pcCards.add(userCards.get(0));
                    userCards.remove(0);
                    pcCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    pcPlay pcPlayer = new pcPlay(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
                }
                else{
                    System.out.println("\nNo one wins. Please try a different attribute.");
                }
            }
            else if((comparator.equals("Strength")) || (comparator.equals("strength"))){
                if(userCards.get(0).strength > pcCards.get(0).strength){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour " + userCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou won " + pcCards.get(0).name + " from your opponent!");
                    userCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    userCards.add(userCards.get(0));
                    userCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                }
                else if(userCards.get(0).strength < pcCards.get(0).strength){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent's " + pcCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent took " + userCards.get(0).name + " from you.");
                    pcCards.add(userCards.get(0));
                    userCards.remove(0);
                    pcCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    pcPlay pcPlayer = new pcPlay(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
                }
                else{
                    System.out.println("\nNo one wins. Please try a different attribute.");
                }
            }
            else if((comparator.equals("Morality")) || (comparator.equals("morality"))){
                if(userCards.get(0).morality > pcCards.get(0).morality){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour " + userCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYou won " + pcCards.get(0).name + " from your opponent!");
                    userCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    userCards.add(userCards.get(0));
                    userCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                }
                else if(userCards.get(0).morality < pcCards.get(0).morality){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent's " + pcCards.get(0).name + " wins.");
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent took " + userCards.get(0).name + " from you.");
                    pcCards.add(userCards.get(0));
                    userCards.remove(0);
                    pcCards.add(pcCards.get(0));
                    pcCards.remove(0);
                    Score.scoreVariable++;
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    pcPlay pcPlayer = new pcPlay(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
                }
                else{
                    System.out.println("\nNo one wins. Please try a different attribute.");
                }
            }

            else{
                System.out.println("\nYour choice is not possible");
            }
        }
    }

}
