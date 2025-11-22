public class Deck {
  // private static final char[] =  A, 2, 3, 4...J, Q,..
  // card array
  private Card[] cards;

  // = 52 cards
  public Deck() {
    this.cards = new Card[Suite.values().length //
      * Rank.values().length];

    int idx = 0;
    for (Suite suite : Suite.values()) { // 4
      for (Rank rank : Rank.values()) { // 13
        // new Card
        this.cards[idx++] = new Card(suite, rank);
      }
    }
  }
  public Card[] getCards(){
    return this.cards;
  }

  public void setCards(Card[] cards) {
    this.cards = cards;
  }

}
