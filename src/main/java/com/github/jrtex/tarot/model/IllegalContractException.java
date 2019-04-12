package com.github.jrtex.tarot.model;

import com.github.jrtex.tarot.TarotException;

public class IllegalContractException extends TarotException {
	private static final long serialVersionUID = 1L;

	public IllegalContractException(Contract c){
		super(c.getPlayer().getName() + " cannot start contract: " + c.name());
	}
}