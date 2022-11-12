public class Card {
    public static final int OROS = 1;
    public static final int COPAS = 2;
    public static final int ESPADAS = 3;
    public static final int BASTOS = 4;

    private int number;
    private int suit;

    public Card(int number, int suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String s = "";
        if (number < 10) {
            s += number;
        } else {
            switch (number) {
                case 10: s += "sota";
                    break;
                case 11: s += "caballo";
                    break;
                case 12: s += "rey";
                    break;
            }
        }
        switch (suit) {
            case OROS: s += " de oros";
                break;
            case COPAS: s += " de copas";
                break;
            case ESPADAS: s += " de espadas";
                break;
            case BASTOS: s += " de bastos";
                break;
        }
        return s;
    }
}
