package br.com.alelo.consumer.consumerpat.util;

import br.com.alelo.consumer.consumerpat.exception.CardTypeInvalidException;
import br.com.alelo.consumer.consumerpat.model.enumeration.CardType;

public class CardBalanceFactory {

	public static AbstractCardBalance createFactory(final CardType cardType){
		if(cardType != null) {
			if(CardType.FOOD.equals(cardType)) {
				return new CardTypeFood();
			} else if (CardType.DRUGSTORE.equals(cardType)) {
				return new CardTypeDrugstore();
			} else if (CardType.FUEL.equals(cardType)) {
				return new CardTypeFuel();
			}
		}

		throw new CardTypeInvalidException();
	}

}