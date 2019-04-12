package com.github.jrtex.tarot;


public abstract class TarotException extends Exception {
	private static final long serialVersionUID = 1L;

	protected TarotException(String message){
		super(message);
	}
}