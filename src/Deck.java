import java.util.Random;
public class Deck {
     Card cards[]=new Card[52];
    String[] suite = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
     Deck(){
         int counter=0;
    for(int i=0;i<4;i++) {
        for (int j = 0; j < 13; j++) {
             cards[counter++]=new Card(suite[i],ranks[j]);

        }


    }

    }
    public String toString() {
        StringBuilder str = new StringBuilder();

        for(int i=0; i<52; i++) {
            str.append(cards[i] + "\n");
        }
        return str.toString();
    }
   void shuffledeck(){
    Random random=new Random();
     for(int i=0;i<6000;i++){
         int random_index=random.nextInt(52);
         Card temp=cards[random_index];
         cards[random_index]=cards[0];
         cards[0]=temp;


    }
     }

}
