public class Music {
    String title;
    String duration;
    String genre;
    String releaseDate;
    Singer singer;


    public Music(String title, String duration, String genre, String releaseDate, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }
    public String getTitle() {
        return title;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for duration
    public String getDuration() {
        return duration;
    }

    // Setter method for duration
    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Getter method for genre
    public String getGenre() {
        return genre;
    }

    // Setter method for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter method for releaseDate
    public String getReleaseDate() {
        return releaseDate;
    }

    // Setter method for releaseDate
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    // Getter method for singer
    public Singer getSinger() {
        return singer;
    }

    // Setter method for singer
    public void setSinger(Singer singer) {
        this.singer = singer;
    }
    public String toString() {
        return String.format("title: %s\nGenre: %s\nduration: %s\nreleasedate: %s, singer:%s",
                title, genre,duration, releaseDate, singer);
    }
}






