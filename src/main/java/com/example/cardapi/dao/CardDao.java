package com.example.cardapi.dao;

import com.example.cardapi.model.Card;

import java.util.UUID;

public interface CardDao {

  int insertPerson(UUID id, Card card);

  default int addCard(Card card){
    UUID id = UUID.randomUUID();
    return insertPerson(id, card);
  }
}
