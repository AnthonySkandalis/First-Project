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
 * Creates the hand for the computer player by taking the second half of the shuffled total of cards.
 * 
 * @author Antonios Skandalis, Nuria Cano Girones
 * @version 1.0
 */
public class PcHalfCards
{

    ArrayList<Card> pcCards=new ArrayList<Card>();

    /**
     * Creates the ArrayList with half of the input ArrayLists contents.
     * 
     * @param cards The ArrayList containing all the cards.
     */
    public PcHalfCards(ArrayList<Card> cards){

        // System.out.println("THESE ARE ALL THE PC CARDS\n");
        for(int i=(cards.size()/2); i<=(cards.size()-1); i++){
            pcCards.add((i-cards.size()/2), cards.get(i));
            //   System.out.println(pcCards.get(i-cards.size()/2));
        }
    }

    public ArrayList<Card> returnCards(){
        return pcCards;
    }
}
