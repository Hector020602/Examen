public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();
        System.out.println(d);
        Card c1 = d.getCard();
        Card c2 = d.getCard();
        System.out.println(c1);
        System.out.println(c2);
    }
}
