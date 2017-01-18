/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan;

/**
 *
 * @author Michael
 */
public class Card {
    private String faceName, suit;
    private int faceValue;
    
    public Card(String faceName, String suit, int faceValue){
        this.faceName = faceName;
        setSuit(suit);
        setFaceValue(faceValue);
    }
    
    /**
     * This method will validate that the suit is either hearts, diamond, spades or clubs
     */
    private void setSuit(String suit){
        if(suit.equalsIgnoreCase("hearts") || suit.equalsIgnoreCase("diamonds") || 
           suit.equalsIgnoreCase("spades") || suit.equalsIgnoreCase("clubs"))
            this.suit = suit;
        else 
            throw new IllegalArgumentException("Suit must be hearts, diamonds, spades or clubs");
    }
    
    /**
     * This method will validate that the card has a value between 2 to 14
     */
    private void setFaceValue(int value){
        if(value >= 2 && value <= 14)
            faceValue = value;
        else
            throw new IllegalArgumentException("Cards must have a value between 2-14");
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This return the value of the card
     * @return 
     */
    public int getFaceValue() {
        return faceValue;
    }
    
    public String toString(){
        return faceName + " of " + suit ;
    }
    
}//end of class
