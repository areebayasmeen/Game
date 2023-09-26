// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Date releaseDate=new Date(20,12,2002);
        Date debutyear=new Date(20,12,2002);

        Singer singer=new Singer("joe","male","canadian",debutyear.toString());
       /* System.out.println("our singer:");
        System.out.println(singer);*/
        Music music=new Music("myLife","two_years","classic music",releaseDate.toString(),singer);
        System.out.println(music);


    }
}