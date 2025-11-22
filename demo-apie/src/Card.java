// ! enum

import java.util.Arrays;
import java.util.Objects;

public class Card {
  private Suite suite; // DIAMOND, CLUB, HEART, SPADE
  private Rank rank; // A,2,3,4,5,6...,J,Q,K

// constructor, getter
  public Card(Suite suite, Rank rank){
    this.suite = suite;
    this.rank = rank;
  }

  public Suite getSuite(){
    return this.suite;
  }
  
  public Rank getRank(){
    return this.rank;
  }


  // equals()
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Card))
      return false;
    Card card = (Card) obj;
    // return this.suite == card.getSuite() this method is also correct
    //  &&  this.rank == card.getRank();
    return Objects.equals(this.suite, card.getSuite()) //
        && Objects.equals(this.rank, card.getRank());
  }

  // hashCode()
  @Override
  public int hashCode(){
    return Objects.hash(this.suite, this.rank);
  }


  @Override
  public String toString(){
    return "Card(" //
      + "suite=" + this.suite //
      + ",rank=" + this.rank //
      + ")";
  }
  public static void main(String[] args) {
    // 52 cards
    // Deck.java
    Deck deck = new Deck(); //call empty constructor
    System.out.println(Arrays.toString(deck.getCards())); // print all cards, with its rank and suite.
    // with for loop, with or without enum;
    Card c1 = new Card(Suite.DIAMOND, Rank.KING);
    Card c2 = new Card(Suite.HEART, Rank.QUEEN);
    System.out.println(c1.equals(c2)); // false

    Card c3 = new Card(Suite.HEART, Rank.QUEEN);
    System.out.println(c2.equals(c3)); // true
  }

}
