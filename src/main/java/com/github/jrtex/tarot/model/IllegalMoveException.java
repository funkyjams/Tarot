package com.github.jrtex.tarot.model;

import com.github.jrtex.tarot.TarotException;

public class IllegalMoveException extends TarotException {
	private static final long serialVersionUID = 1L;

	public IllegalMoveException(PlayedCard card){
		super(card.getPlayer().getName() + " cannot play card " + card.getCard() );
	}
}