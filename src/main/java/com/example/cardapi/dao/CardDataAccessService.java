package com.example.cardapi.dao;
import com.example.cardapi.model.Card;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("cardDao")
public class CardDataAccessService implements CardDao {

private static List<Card> DB = new ArrayList<>();

  @Override
  public int insertCard(UUID id, Card card) {
    DB.add(new Card(id, card.getName()));
    return 1;
  }
}
