/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame.BackEnd;

import java.util.ArrayList;

/**
 *
 * @author GamingPC
 */
public class Hand {
    
    int handSize;
    ArrayList<Integer> currentHand;
    
    public Hand(int handSize){
        this.handSize = handSize;
        currentHand = new ArrayList<Integer>();
    }
    
    public void receiveHand(Deck deck){ //Deals the set amount of cards to the hand
        for(int i = 0; i < handSize; i++){
            currentHand.add(deck.deal());
        } 
    }
    
    public ArrayList<Integer> getHand(){
        return currentHand;
    }
    
}
