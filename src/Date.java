public class Date {
    private int day;
    private int year;
    private int month;

    public void setYear(int year){
        if (year >= 1){
            this.year = year;
        }
    }

    public int getYear(){
        return year;
    }
}
