public class Deck {
    private Card[] cards;
    private int numCards;

    public Deck() {
        numCards = 48;
        cards = new Card[48];
        int i = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int number = 1; number <= 12; number++) {
                cards[i] = new Card(number, suit);
                i++;
            }
        }

    }

    public void shuffle() {
        for (int k = 0; k < 1000; k++) {
            int i = (int)(Math.random() * 48);
            int j = (int)(Math.random() * 48);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public void shuffle2() {
        Card[] temp = new Card[48];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = null;
        }
        int counter = 0;
        while (counter < 48) {
            int random = (int)(Math.random() * 48);
            if (temp[random] == null) {
                temp[random] = cards[counter];
                counter++;
            }
        }
        cards = temp;
    }

    public Card getCard() {
        numCards--;
        return cards[numCards];
    }

    @Override
    public String toString() {
        String s = "";
        for (int suit = 1; suit <= 4; suit++) {
            Boolean first = true;
            for (int i = 0; i < numCards; i++) {
                if (cards[i].getSuit() == suit) {
                    if (first) {
                        first = false;
                    } else {
                        s +=", ";
                    }
                    s += cards[i];
                }
            }
            s += "\n";
        }
        return s;
    }



}
