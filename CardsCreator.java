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
 * This class takes the information from a file and stores it as the card information in the ArrayList<Card> class.
 * Also shuffles the ArrayList of cards randomly.
 * 
 * @author Nuria Cano Girones 
 * @version 1.0
 */
public class CardsCreator
{
    ArrayList<Card> cards=new ArrayList<Card>();
    //ArrayList<Card> userCards=new ArrayList<Card>();
    //ArrayList<Card> pcCards=new ArrayList<Card>();
    public Card card;

    public CardsCreator (File file)
    {
        getData (file);

    }

    /**
     * 
     * Creates a new Card ArrayList with the contents of the file that is input.
     * 
     * @param file The text file used to generate the card data.
     * 
     */
    private void getData(File file){
        Scanner scanner = null;

        try {
            scanner= new Scanner (file);
        }
        catch (Exception e){
            System.out.println("error when scanning the file");
        }

        while (scanner.hasNext()){
            String line=scanner.nextLine();
            String[] items=line.split("[,]");          
            int id=Integer.parseInt(items[0]);
            String name=items[1];
            int magic=Integer.parseInt(items[3]);
            int speed=Integer.parseInt(items[5]);
            int lethality=Integer.parseInt(items[7]);
            int strength=Integer.parseInt(items[9]);
            int morality=Integer.parseInt(items[11]);

            card=new Card(id,name,magic,speed,lethality,strength,morality);
            cards.add(card);
        }

        scanner.close();

        Collections.shuffle(cards);        
    }

    public ArrayList<Card> returnCards(){
        return cards;
    }


    //     public void printCards(){
    //         //Collections.shuffle(cards);
    //         System.out.println("THESE ARE ALL THE CARDS\n");
    //         for (int i=0; i<cards.size(); i++){
    //             System.out.println(cards.get(i));
    // 
    //         }
    // 
    //         System.out.println(" ");
    //     }

    //     private void userHalfCards(){
    //         System.out.println("THESE ARE ALL THE USER CARDS\n");
    //         for (int i=0; i<(cards.size() / 2); i++){
    //             userCards.add(i, cards.get(i));
    //             System.out.println(userCards.get(i));
    //         }
    //         System.out.println(" ");
    //     }

    //     private void pcHalfCards(){
    //         System.out.println("THESE ARE ALL THE PC CARDS\n");
    //         for(int i=(cards.size()/2); i<=(cards.size()-1); i++){
    //             pcCards.add((i-cards.size()/2), cards.get(i));
    //             System.out.println(pcCards.get(i-cards.size()/2));
    //         }
    //     }

}