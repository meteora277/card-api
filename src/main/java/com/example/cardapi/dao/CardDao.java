package com.example.cardapi.dao;

import com.example.cardapi.model.Card;

import java.util.UUID;

public interface CardDao {

  int insertCard(UUID id, Card card);

  default int insertCard(Card card){
    UUID id = UUID.randomUUID();
    return insertCard(id, card);
  }
}
