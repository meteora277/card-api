
package com.example.cardapi.model;
import java.util.UUID;

public class Card {
  
  private final UUID id;
  private final String name;

  public Card(UUID id, String name) {
    this.id = id;
    this.name = name;
  }
  public UUID getId() {
    return id;
  }
  public String getName() {
    return name;
  }
}
