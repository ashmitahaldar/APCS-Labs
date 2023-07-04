// Class: Blackjack
// Purpose: Main class used to play the card game Blackjack
// @author TAS
// @version November 2021

import java.util.Scanner;

public class Blackjack {
    // deck of cards used for this game
    private Deck deck;

    // arrays to hold the dealer's and player's hands
    private Card[] dealerHand;
    private Card[] playerHand;

    // indexes to keep track of cards in players hands
    private Integer numOfPlayerCards;
    private Integer numOfDealerCards;

    // keep track of win points for player
    private int playerWinPoints;

    // number of rounds that have been played
    private static int rounds;

    // scanner used for keyboard input
    private Scanner kb;

    // constructor
    public Blackjack() {
        deck = new Deck(2); // initializing the deck of 2

        dealerHand = new Card[12]; // initializing the array for the dealer's hand
        playerHand = new Card[12]; // initializing the array for the player's hand
        numOfPlayerCards = 0; // initialzing the index used to keep track of the player's cards
        numOfDealerCards = 0;

        playerWinPoints = 0; // initializing the variable for the player's points
        rounds = 0; // initializing the static variable to keep track of the number of rounds
        kb = new Scanner(System.in);
    }

    // "main" method in the class, used to play one complete round of Blackjack
    public void playRound() {
        boolean playGame = true; // boolean used to run one full round
        
        resetHands(); // resets and clears the dealer's and player's at the start of each game

        deck.initializeDeck(); // initializes the deck of 2

        if ((rounds % 4 == 0) && !(rounds == 0)) // shuffling the deck after every 4 rounds
        {
            System.out.println("@@@@@@ Wait a sec, shuffling deck @@@@@@\n");
            deck.shuffle();
        }
        
        rounds++;

        //dealing first 2 cards to player and dealer
        dealCardToPlayers(dealerHand, numOfDealerCards); numOfDealerCards++;
        dealCardToPlayers(dealerHand, numOfDealerCards); numOfDealerCards++;
        dealCardToPlayers(playerHand, numOfPlayerCards); numOfPlayerCards++;
        dealCardToPlayers(playerHand, numOfPlayerCards); numOfPlayerCards++;

        
        // print out 1 card of the dealer, and the 2 cards of the player at the start of each round
        System.out.println("Dealer: " + dealerHand[0]);
        System.out.println("Player: " + printHand(playerHand) + " : " + getHandValue(playerHand));
        
        // loop to begin the meat of the game owo
        while (playGame){
            
            if (getHandValue(playerHand) == 21) // checks for a blackjack on the player's side first
            {
                System.out.println("\n!!! Player gets a blackjack and 2 points, nice! !!!\n");
                playerWinPoints += 2; // awards the player 2 points
                printPlayerPoints(); // displays the player's points
                playGame = false; // ends the current round
            } 
            else if (getHandValue(playerHand) > 21) // checks for a bust on the player's side
            {
                System.out.println("\n### Player busted! Dealer wins! ###\n");
                playerWinPoints--; // deducts 1 point for the player due to their loss
                printPlayerPoints(); // displays the player's points
                playGame = false; // ends the current round
            } 
            else // runs if player neither got a blackjack nor busted with the first two cards dealt
            {
                hitOrStand(kb); // lets the player hit to gain cards, or to stand
                if (getHandValue(playerHand) > 21) // checks for a bust on the player's side
                {
                    System.out.println("\n### Player busted! Dealer wins! ###\n");
                    playerWinPoints--; // deducts 1 point for the player due to their loss
                    printPlayerPoints(); // displays the player's points
                    playGame = false; // ends the current round
                    break; // breaks the current while loop to end the game after the player's bust
                } 
                dealersTurn(); // the dealer gets cards dealt
                System.out.println("Dealer: " + printHand(dealerHand) + " : " + getHandValue(dealerHand)); // prints dealer's hand
                checkWinner(); // checks for a winner according to points
                printPlayerPoints(); // displays the player's points
                playGame = false; // ends the current round
            }
        }  
    }

    // after a round, clear out the player/dealer hands
    public void resetHands() {
        dealerHand = new Card[12]; // creating a new empty array for the dealer's hand
        playerHand = new Card[12]; // creating a new empt array for the player's hand
        // resetting the index for the number of cards in the player's and dealer's hand
        numOfDealerCards = 0;
        numOfPlayerCards = 0;
    }

    // return a nicely formatted string of the cards in a hand
    public String printHand(Card[] cards) {
        String out = "";

        out += "[";
        for (int i = 0; i < cards.length; i++) // goes through each card in the array
        {
            if (!(cards[i] == null)){
                out = out + cards[i].toString(); // gets the face, the suit and the value of each card.
                if (cards[i+1] != null) // this if statement ensures that the comma isn't added after the last card in the array
                {
                    out += ", ";
                }
            }
        }
        out += "]";

        return out;
    }

    // look at the current hands and determine a winner, and print it out
    public void checkWinner() {
        // gets the total value of each hand
        int playerHandValue = getHandValue(playerHand);
        int dealerHandValue = getHandValue(dealerHand);

        if (dealerHandValue > 21) // checks for a bust on the dealer's side
        { 
            System.out.println("\n### Dealer busted! Player wins! ###\n");
            playerWinPoints++; // awards the player points
        } 
        else if ((playerHandValue > dealerHandValue) && (playerHandValue <= 21)) // checks for a player win
        {
            System.out.println("\n$$$ Player wins! $$$\n");
            playerWinPoints++;
        } 
        else if ((dealerHandValue > playerHandValue) && (dealerHandValue <= 21)) // checks for a dealer win
        {
            System.out.println("\n--- Dealer wins! ---\n");
            playerWinPoints--;
        } 
        else if (dealerHandValue == playerHandValue) // checks for a tie
        {
            System.out.println("\n--- It's a tie! ---\n");
        }
    }

    // calculate the value of a hand (handle aces correctly!)
    public int getHandValue(Card[] cards) {
        int sum = 0;

        for (Card c : cards) // goes through each card in the array
        {
            if (!(c == null))
            {
                if (c.getFace() == 1)
                {
                    if (sum + 11 <= 21) // handling aces, if adding an 11 would not lead to a bust, ace will be counted as an 11
                    {
                        sum += 11;
                    } else sum += 1; // else ace will be counted as a 1
                } else 
                {
                    sum += c.getValue(); // if the card isn't an ace, deal with values normally
                } 
            }
        }

        return sum;
    }

    public void dealCardToPlayers(Card[] hand, Integer index) // deals card once to the designated array of cards, and requires a variable for the index
    {
        hand[index] = deck.dealCard();
    }

    public void printPlayerPoints() // prints the player's points
    {
        System.out.println("Score is: P = " + playerWinPoints);
    }

    public void hitOrStand(Scanner keyboard) // method for the player to hit as they wish, then stand
    {    
        String userInput;
        char c;
        do {
            do {
                System.out.println("Player! What would you like to do? (H)it or (S)tand? ");
                userInput = keyboard.nextLine();
                if (userInput == null || userInput.length() == 0) // checks for if user input is a string of length 0, or is null
                {
                    c = '0';
                    continue;   
                } else c = userInput.toUpperCase().charAt(0); // turns user's designated input into a char
            } while ( ! ( c == 'H' || c == 'S' ) ); // repeats if user's input is not a 'H' or 'S'
                if ( c == 'H' ) {
                    dealCardToPlayers(playerHand, numOfPlayerCards);
                    numOfPlayerCards++;
                    System.out.println("\n*** " + playerHand[numOfPlayerCards-1].toString() + " ***\n"); // prints out card recieved
                    System.out.println("Player: " + printHand(playerHand) + " : " + getHandValue(playerHand) + "\n");
                }
            } while (c != 'S' && getHandValue(playerHand) <= 21 ); // runs while the hand value is less than 21, and/or as long as the player does not stand
        }

    public void dealersTurn() // method to run code for the dealer's turn to hit for cards
    {
        while (getHandValue(dealerHand) < 17) // as long as the dealer's hadn value is less than 17, they will continue to hit
        {
            dealCardToPlayers(dealerHand, numOfDealerCards);
            numOfDealerCards++;
            System.out.println("\n*** " + dealerHand[numOfDealerCards-1].toString() + " ***\n");
        }
        if (getHandValue(dealerHand) == 17) // checks for soft 17
        {
            boolean hasAce = false;
            boolean hasSix = false;
            for (Card c : dealerHand) // checks if there is an ace in the dealer's hand
            {
                if (!(c == null) && c.getValue() == 11)
                {
                    hasAce = true;
                    break;
                }
            }
            for (Card c : dealerHand) // checks if there is a 6 in the dealer's hand
            {
                if (!(c == null) && c.getValue() == 6)
                {
                    hasSix = true;
                    break;
                }
            }
            if (hasAce && hasSix) System.out.println("--- Dealer has reached soft 17, automatically standing ---");
        }
    }
}
