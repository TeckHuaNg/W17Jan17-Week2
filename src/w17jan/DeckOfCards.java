/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class DeckOfCards {
    ArrayList<Card> deck;
    
    public DeckOfCards(){
        deck = new ArrayList<>();
        
        String[] suits = {"hearts", "diamonds", "spades", "clubs"};
        String[] faceNames = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                              "Jack", "Queen", "King", "Ace"};
        
        for(String suit : suits){
            for(int i=0; i<faceNames.length; i++){
                Card newCard = new Card(faceNames[i], suit, i+2);
                deck.add(newCard);
            }
        }
    }
    
    /**
     * This method will simulate shuffling the deck
     */
    
    public void shuffle(){
        
        if(deck.size() > 2){
        SecureRandom rng = new SecureRandom();
        //Collections.shuffle
        for(int i=1; i<deck.size(); i++){
            Card swapCard = deck.remove(i);
            deck.add(rng.nextInt(52), swapCard);
        }
      }    
    }
    
    /**
     * This method will "deal" the top card from the deck
     */
    public Card dealTopCard(){
        if(deck.size() > 0)
           return deck.remove(0);
        return null;
    }
}
