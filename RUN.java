import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.Object;
import java.util.Objects;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Thread;
/**
 * Main method of the program. First takes the text file with the card info and stores it as Card class variables.
 * Then creates the user and the computer halfs.
 * Then lets the player make the first move of the game.
 * After the game is over, outputs the winner and the score.
 * 
 * @author Nuria Cano Girones, Antonios Skandalis
 * @version 1.0
 */
public class RUN
{

    public static void main(String[] args){

        File file= new File ("C:\\Users\\Anthony\\Documents\\University\\Programming Group Project\\OOLP GROUP COURSEWORK - Copy\\PROJECT\\CARDS_info.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);

            fis.close();
        }

        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
        System.out.println("Welcome to Top Trumps: Ancient Mythology!!");

        CardsCreator cardsCreator = new CardsCreator (file);
        ArrayList<Card> cards = new ArrayList<Card>(cardsCreator.returnCards());

        UserHalfCards cardsUser= new UserHalfCards(cards);
        ArrayList<Card> userCards = new ArrayList<Card>(cardsUser.returnCards());

        PcHalfCards cardsPc= new PcHalfCards(cards);
        ArrayList<Card> pcCards = new ArrayList<Card>(cardsPc.returnCards());
        

        UserTest playing=new UserTest(userCards,pcCards, cards, AverageCalculator.avMagicCalc(cards), AverageCalculator.avSpeedCalc(cards), AverageCalculator.avLethalityCalc(cards), AverageCalculator.avStrengthCalc(cards), AverageCalculator.avMoralityCalc(cards));
        
        if (userCards.size() == 0){
            System.out.println("\nUnfortunately you ran out of cards and the computer won.. Please try again!");
        }
        else if(pcCards.size() == 0){
            System.out.println("\nLooks like you managed to win against the computer. Congratulations!!");
            System.out.println("Your score was:" + Score.scoreVariable);
        }

        //cardsCreator.userTest();
    }   
}
