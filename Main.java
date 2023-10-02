// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int counter=0;
        int score;
        Game game=new Game();
        System.out.println("guess a number");
        game.takeUserInput();
        while(!game.isCorrect()){
        if(game.isCorrect())
        {
            System.out.println("you win");
        }
        else{
            game.guess();
            game.takeUserInput();

            counter++;
        }}
        if (counter<=5)
        {
            score=90;
        }
        else if (counter<=10){
            score=70;
        }
        else if (counter<=20){
            score=50;
        }
        else if (counter<=40){
            score=20;
        }
        else {
            score=5;
        }
        System.out.println("your score is "+score);
    }
}