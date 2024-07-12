package src;

import java.util.Random;

public class Player {
    private String playerName;
    private Hand hand;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    // Method to randomly create a hand for the player
    public void createRandomHand() {
        Random random = new Random();
        int randomValue = random.nextInt(3); // Generates random number 0, 1, or 2
        switch (randomValue) {
            case 0:
                this.hand = new Gu(); // Assuming Gu, Choki, and Pa are subclasses of Hand
                break;
            case 1:
                this.hand = new Choki();
                break;
            case 2:
                this.hand = new Pa();
                break;
            default:
                // Handle unexpected cases, although this shouldn't happen in this scenario
                throw new IllegalStateException("Unexpected value: " + randomValue);
        }
    }

    // Getters and setters for playerName and hand
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    // Method to compare hands with another player
    public int compareHand(Player otherPlayer) {
        Hand otherHand = otherPlayer.getHand();
        return this.hand.compareWith(otherHand); // Assuming Hand has a method compareWith(Hand otherHand)
    }
}
