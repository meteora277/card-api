package com.example.cardapi.api;
import com.example.cardapi.model.Card;
import com.example.cardapi.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/card")
@RestController
public class CardController {
  
  private final CardService cardService;

  @Autowired
  public CardController(CardService cardService) {
    this.cardService = cardService;
  }
  @PostMapping
  public void addCard(@RequestBody Card card ) {
    cardService.addCard(card);
  }

}
