// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Deck deck=new Deck();
        Card c = new Card("Diamond", "Ace");
        System.out.println(c);
        System.out.println(deck);


        deck.shuffledeck();
        System.out.println(deck);

}}