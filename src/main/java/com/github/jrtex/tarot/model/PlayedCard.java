package com.github.jrtex.tarot.model;

public class PlayedCard {

	private Player player;
	private TarotCard card;


	public PlayedCard(Player p, TarotCard c){
		this.player = p;
		this.card = c;
	}

	// Getters
	public Player getPlayer(){
		return player;
	}
	public TarotCard getCard(){
		return card;
	}


	// Extend Card properties
	public TarotCard.Suit getSuit(){
		return card.getSuit();
	}
	public int getRank(){
		return card.getRank();
	}


	// Other
	@Override
	public String toString(){
		return ("Player " + player.getName() + " played card " + card.toString() );
	}
}
