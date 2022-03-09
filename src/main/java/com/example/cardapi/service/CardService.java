package com.example.cardapi.service;

import com.example.cardapi.dao.CardDao;
import com.example.cardapi.model.Card;

public class CardService {
  private final CardDao cardDao;
  
  public CardService(CardDao cardDao) {
    this.cardDao = cardDao;
  }

  public int addCard(Card card) {
    return cardDao.insertCard(card);

  }

}
