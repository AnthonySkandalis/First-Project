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
/**
 * Creates the hand for the human player by taking the first half of the shuffled total of cards.
 * 
 * @author Antonios Skandalis, Nuria Cano Girones
 * @version 1.0
 */
public class UserHalfCards
{
    ArrayList<Card> userCards = new ArrayList<Card>();

    /**
     * Creates the ArrayList with half of the input ArrayLists contents.
     * 
     * @param cards The ArrayList containing all the cards.
     */
    public UserHalfCards(ArrayList<Card> cards){      
       
       
       //System.out.println("THESE ARE ALL THE USER CARDS\n");
        for (int i=0; i<(cards.size() / 2); i++){
            userCards.add(i, cards.get(i));
       //     System.out.println(userCards.get(i));
        }
       // System.out.println(" "); 
        
     }
    
    public ArrayList<Card> returnCards(){
        return userCards;
    }
  
   
}
