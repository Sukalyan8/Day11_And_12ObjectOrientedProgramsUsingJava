package com.bridgelabz.oop.DecksOfCard;


import java.util.Random;

public class DeckOfCards {

    int[][] cards = new int[4][13];

    public static void main(String[] args) {

        // creating deck of card  class object.
        DeckOfCards deckofcards = new DeckOfCards(); 

        // assigning cards for each player
        for (int playerNumber = 1; playerNumber < 5; playerNumber++) {
            deckofcards.allotCard(playerNumber);
            System.out.println("Player " + playerNumber + "' cards:" + "\t");
            
            //prints cards of respective player
            deckofcards.print(playerNumber);

        }
    }

    /**
     * here player will get a card 9 cards through a loop. when a loop start and
     * loop condition is true allot one card method gets call() untill player
     * get 9 cards.
     *
     * @param playerNumber
     */
    private void allotCard(int playerNumber) {

        for (int i = 0; i < 9; i++) {
            allotOneCard(playerNumber);
        }

    }

    /**
     * Allots only one card randomly and also suit and rank will be given to
     * that card.
     *
     * @param playerNumber
     */
    private void allotOneCard(int playerNumber) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cards[suit][rank] != 0) {
            allotOneCard(playerNumber);
        } else {
            cards[suit][rank] = playerNumber;
        }

    }

    /**
     * Prints cards in ascending order and also print name of rank and suit
     * value like ace of 2 ..
     *
     * @param playerNumber
     */
    void print(int playerNumber) {

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if (cards[suit][rank] == playerNumber) {
                    System.out.println(getSuit(suit) + " " + getRank(rank) + "\t\t");
                }

            }// ends of inner for loop

        } // ends of outer for loop
        System.out.println();
    }

    /**
     *
     * @param suitNumber
     * @return suit number to string
     */
    private String getSuit(int suitNumber) {

        switch (suitNumber) {
            case 0:
                return "Clubs";
            case 1:
                return "Diamonds";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            default:
                return "";
        }

    }

    /**
     *
     * @param rankNumber
     * @return rank String number
     */
    private String getRank(int rankNumber) {

        switch (rankNumber) {
            case 0:
                return "2";
            case 1:
                return "3";
            case 2:
                return "4";
            case 3:
                return "5";
            case 4:
                return "6";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                return "";
        }

    }

} //end of class