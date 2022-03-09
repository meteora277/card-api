package com.example.cardapi.service;

import com.example.cardapi.dao.CardDao;
import com.example.cardapi.model.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CardService {
  private final CardDao cardDao;
  
  @Autowired
  public CardService(@Qualifier("cardDao") CardDao cardDao) {
    this.cardDao = cardDao;
  }

  public int addCard(Card card) {
    return cardDao.insertCard(card);

  }

}
