import java.util.*;
import java.io.*;
/**
 * Creates the card class, the class used to represent the cards in the game.
 * 
 * @author Nuria Cano Girones
 * @version 1.0
 */
public class Card
{
    public int id, magic, speed, lethality, strength, morality;
    public String name;
    
    public Card (int id, String name, int magic, int speed, int lethality, int strength, int morality){
        this.id=id;
        this.name=name;
        this.magic=magic;
        this.speed=speed;
        this.lethality=lethality;
        this.strength=strength;
        this.morality=morality;
        
        }
        
   public String toString(){
    return id+":"+name+" ->"+" Magic: "+magic+", Speed: "+speed+", Lethality: "+lethality+", Strength: "+strength+", Morality: "+ morality;   
    }
    
    public int getId (){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getMagic (){
        return this.magic;
    }
    
    public int getSpeed (){
        return this.speed;
    }
    
    public int getLethality (){
        return this.lethality;
    }
    
    public int getStrength (){
        return this.strength;
    }
    
    public int getMorality (){
        return this.morality;
    }
    
    
}
