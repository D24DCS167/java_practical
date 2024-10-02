/**Create a class called Date that includes three pieces of 
information as instance variables—a month (type int), a day 
(type int) and a year (type int). Your class should have a 
constructor that initializes the three instance variables and 
assumes that the values provided are correct. Provide a set 
and a get method for each instance variable. Provide a 
method displayDate that displays the month, day and year 
separated by forward slashes (/). Write a test application 
named DateTest that demonstrates class Date’s capabilities.  */

class Date {
    int month;
    int day;
    int year;

    Date() {}
    Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    void setDate(int day) {
        this.day = day;
    }

    void setMonth(int month) {
        this.month = month;
    }

    void setYear(int year) {
        this.year = year;
    }
    
    int getMonth()
    {
        return month; 
    }
    int getDate()
    {
        return day;
    }
    int getYear()
    {
        return year;
    }
    void displayDate()
    {
        System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}

public class P14 {
    public static void main(String[] args) {
        Date date = new Date(12, 25, 2022);

        System.out.println("\nInitial date:");
        date.displayDate();

        date.setMonth(6);
        date.setDate(15);
        date.setYear(2023);

        System.out.println("Updated date:");
        date.displayDate();
        System.out.println("\n");
    }
}

