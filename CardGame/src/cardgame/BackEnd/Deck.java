/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.BackEnd;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author GamingPC
 */
public class Deck {
    public ArrayList<Integer> currentDeck;
    
    public Deck(){
        currentDeck = new ArrayList<>();
        shuffle();
    }
    
    public void shuffle(){
        currentDeck.clear();
        ArrayList<Integer> temp = currentDeck;
        
        for(int i = 0; i < 52; i++){ //Fill temp with numbers
            temp.add(i+1);
        }
        
        for(int i = 0; i < 52; i++){
            Random rand = new Random();
            int n = rand.nextInt(51-i)+1; //Get Random number for wanted card
            
            currentDeck.add(temp.get(n)); //Add randomly selected card from temp to currentDeck
            
            temp.remove(n); //Remove selected card from temp
        }
        
    }
    
    public int deal(){
        int temp = 0;
        if(!currentDeck.isEmpty()){
           temp = currentDeck.get(0);
           currentDeck.remove(0);
        }
        else{
            System.out.println("The Deck is Empty");
        }
        return temp;
    }
    
    public boolean isEmpty(){
        return currentDeck.isEmpty();
    }
    
}
