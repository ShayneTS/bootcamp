public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards) {
    // if cards.length !=5, throw exception // ! = not, so !=5 means "is not 5"
    this.cards = cards;
  }

  //setcard

  public boolean withEmptyCard() {
    return cards[0] == null || cards [1] == null //
    || cards[2] == null || cards[3] == null //
    || cards[4] == null;
  }
  // 33322 > true
  // AAA99 > true
  // A9A9A > true
  public boolean isFullHouse(){ //read only
    // Algorithm
    if (withEmptyCard())
      return false;
    int[] boxes = new int[13]; // 13 ranks in total
    for (Card card : this.cards) {
      boxes[card.getRank().getValue() -1]++;
    }
    // searching 3
    // one 3, one 2, eleven 0
    int threeCount = 0;
    int twoCount = 0;
    int zeroCount = 0;
    for (int i = 0; i < 13; i++) {
      if (boxes[i] == 0) zeroCount++;
      else if (boxes[i] == 2) twoCount++;
      else if (boxes[i] == 3) threeCount++;
    }
    return zeroCount == 11 && twoCount == 1 && threeCount == 1;


    // setcard for hm?
  }
  // Challenge: Straight Flush 同花順 A2345(DIAMOND)

  public static void main(String[] args) {
    // get 5 cards
    Card[] hand1 = new Card[] {
      new Card (Suite.HEART, Rank.ACE)//
      , new Card (Suite.CLUB, Rank.ACE)//
      , new Card (Suite.HEART, Rank.TEN) // 
      , new Card (Suite.DIAMOND, Rank.ACE)//
      , new Card (Suite.SPADE, Rank.TEN)
    };
    Card[] hand2 = new Card[] {
      new Card (Suite.HEART, Rank.TWO)//
      , new Card (Suite.CLUB, Rank.ACE)//
      , new Card (Suite.HEART, Rank.TEN) // 
      , new Card (Suite.DIAMOND, Rank.QUEEN)//
      , new Card (Suite.SPADE, Rank.TEN)
    };
    // check if it is fullhouse
    HandManager hm = new HandManager(hand1);
    System.out.println(hm.isFullHouse()); //true
    // with set card
    // hm.setCards(hand2);
    HandManager hm2 = new HandManager(hand2);
    System.out.println(hm2.isFullHouse()); //false
  }
}
