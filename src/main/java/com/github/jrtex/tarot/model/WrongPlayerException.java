package com.github.jrtex.tarot.model;

import com.github.jrtex.tarot.TarotException;

public class WrongPlayerException extends TarotException {
	private static final long serialVersionUID = 1L;

	public WrongPlayerException(Player p){
		super(p.getName() + " must wait his turn to play");
	}
}