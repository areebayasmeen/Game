public class Date {
    int day;
    int month;
    int year;
    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;


    }
    public String toString(){
        return   String.format("%d/%d/%d",day,month,year);
    }
    void setDay(int day) {
        this.day = day;
    }
    int getDay(){
        return day;
    }
    void setMonth(int month) {
        this.month= month;
    }
    int getMonth(){
        return month;
    }
    void setYear(int year) {
        this.year = year;
    }
    int getYear(){
        return year;
    }


}
