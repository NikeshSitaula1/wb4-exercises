package com.pluralsight;

import java.util.ArrayList;

public class BlackJackGame {

    private Deck deck;
    private ArrayList<Player> players;
    private Player dealer;

    public BlackJackGame(){
        this.deck = new Deck();
        this.deck.shuffle();;
        players = new ArrayList<Player>();
        this.dealer = new Player("Dealer");
    }

    public void AddPlayer(String playerName){
        //Player p = new Player(playerName);
        //players.add(p);
        players.add(new Player(playerName));
    }

    public void AddPlayer(Player player){
        players.add(player);
    }

    public void DealCards(){

        for(Player player : this.players){
            player.getHand().Deal(deck, 2);

        }
        dealer.getHand().Deal(deck, 2);
    }

    public Deck getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getDealer() {
        return dealer;
    }

    public Player[] getWinner(){
        //look through all the players, figure out the one
        // with the highest score that is NOT above 21, call them out
        return null;
    }
}
