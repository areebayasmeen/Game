public class Card {
     String suite;
     String rank;
    Card(String suite,String rank){
        this.suite=suite;
        this.rank=rank;
    }
public String toString(){
        return rank  + " of " +   suite;
}
}
