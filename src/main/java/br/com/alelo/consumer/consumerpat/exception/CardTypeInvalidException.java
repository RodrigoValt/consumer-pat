package br.com.alelo.consumer.consumerpat.exception;

public class CardTypeInvalidException extends BadRequestException {

	private static final long serialVersionUID = 1L;

	public CardTypeInvalidException() {
		super("Card Type Invalid.");
	}

}