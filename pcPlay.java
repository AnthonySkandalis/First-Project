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
 * One method class that runs whenever the computer wins a round. Checks first whether the game has ended and if not it chooses which attribute to compare to the player depending on which attribute has a value higher than the average.
 * 
 * @author Antonios Skandalis 
 * @version 1.0
 */
public class pcPlay
{
    public pcPlay(ArrayList<Card> userCards, ArrayList<Card> pcCards, ArrayList<Card> cards, int avMagic, int avSpeed, int avLethality, int avStrength, int avMorality){
        computerPlayer(userCards, pcCards, cards, avMagic, avSpeed, avLethality, avStrength, avMorality);
    }

    /**
     * Method for the automation of the computer player.
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
    public void computerPlayer(ArrayList<Card> userCards,ArrayList<Card> pcCards, ArrayList<Card> cards, int avMagic, int avSpeed, int avLethality, int avStrength, int avMorality){

        System.out.println("\nSince you lost the last round it is now time for the computer to play.");
        while (userCards.size() != 0 && pcCards.size() != 0){
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            System.out.println("\nThis is your card");
            System.out.println(userCards.get(0));
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }

            if(pcCards.get(0).magic > avMagic){
                if(userCards.get(0).magic > pcCards.get(0).magic){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent chose his card's magic attribute.");
                    try{
                        Thread.sleep(5000);
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
                    UserTest playing=new UserTest(userCards,pcCards, cards, AverageCalculator.avMagicCalc(cards), AverageCalculator.avSpeedCalc(cards), AverageCalculator.avLethalityCalc(cards), AverageCalculator.avStrengthCalc(cards), AverageCalculator.avMoralityCalc(cards));
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
                    System.out.println("\nYour opponent chose his card's magic attribute.");
                    try{
                        Thread.sleep(5000);
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

                }

            }
            else if(pcCards.get(0).speed > avSpeed){
                if(userCards.get(0).speed > pcCards.get(0).speed){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent chose his card's speed attribute.");
                    try{
                        Thread.sleep(5000);
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
                    UserTest playing=new UserTest(userCards,pcCards, cards, AverageCalculator.avMagicCalc(cards), AverageCalculator.avSpeedCalc(cards), AverageCalculator.avLethalityCalc(cards), AverageCalculator.avStrengthCalc(cards), AverageCalculator.avMoralityCalc(cards));

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
                    System.out.println("\nYour opponent chose his card's speed attribute.");
                    try{
                        Thread.sleep(5000);
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

                }

            }
            else if(pcCards.get(0).lethality > avLethality){
                if(userCards.get(0).lethality > pcCards.get(0).lethality){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent chose his card's lethality attribute.");
                    try{
                        Thread.sleep(5000);
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
                    UserTest playing=new UserTest(userCards,pcCards, cards, AverageCalculator.avMagicCalc(cards), AverageCalculator.avSpeedCalc(cards), AverageCalculator.avLethalityCalc(cards), AverageCalculator.avStrengthCalc(cards), AverageCalculator.avMoralityCalc(cards));

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
                    System.out.println("\nYour opponent chose his card's lethality attribute.");
                    try{
                        Thread.sleep(5000);
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

                }

            }
            else if(pcCards.get(0).strength > avStrength){
                if(userCards.get(0).strength > pcCards.get(0).strength){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent chose his card's strength attribute.");
                    try{
                        Thread.sleep(5000);
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
                    UserTest playing=new UserTest(userCards,pcCards, cards, AverageCalculator.avMagicCalc(cards), AverageCalculator.avSpeedCalc(cards), AverageCalculator.avLethalityCalc(cards), AverageCalculator.avStrengthCalc(cards), AverageCalculator.avMoralityCalc(cards));

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
                    System.out.println("\nYour opponent chose his card's strength attribute.");
                    try{
                        Thread.sleep(5000);
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

                }

            }
            else{
                if(userCards.get(0).morality > pcCards.get(0).morality){
                    System.out.println("\nYour opponent's card was " + pcCards.get(0).name + ".");
                    System.out.println(pcCards.get(0));
                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException ex){
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("\nYour opponent chose his card's morality attribute.");
                    try{
                        Thread.sleep(5000);
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
                    UserTest playing=new UserTest(userCards,pcCards, cards, AverageCalculator.avMagicCalc(cards), AverageCalculator.avSpeedCalc(cards), AverageCalculator.avLethalityCalc(cards), AverageCalculator.avStrengthCalc(cards), AverageCalculator.avMoralityCalc(cards));

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
                    System.out.println("\nYour opponent chose his card's morality attribute.");
                    try{
                        Thread.sleep(5000);
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

                }

            }
        }

    }

}
