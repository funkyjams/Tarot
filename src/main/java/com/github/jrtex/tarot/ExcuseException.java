package com.github.jrtex.tarot;

import com.github.jrtex.tarot.TarotException;

public class ExcuseException extends TarotException {

	private static final long serialVersionUID = 1L;

	public ExcuseException(){
		super("The Excuse cannot be switched at the moment");
	}
}