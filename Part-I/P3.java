/*Write a program to take the user for a distance (in meters) and 
the time taken (as three numbers: hours, minutes, seconds), 
and display the speed, in meters per second, kilometers per 
hour and miles per hour (hint:1 mile = 1609 meters).*/
import java.util.Scanner;

public class P3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in meter : ");
        double dist_meter = sc.nextInt();

        System.out.println("Enter Time in Format of (Hour , Minute ,Second) : ");
        int Hour = sc.nextInt();
        int Minute = sc.nextInt();
        int second =  sc.nextInt();

        //Calculating time in seconds 

        int total_time = Hour * 3600 * Minute * 60 + second;

        //Time as meter per seconds

        double  meter_per_sec = (dist_meter)/(total_time);
        double km_per_hour =  (dist_meter/1000)/(total_time/3600);
        double km_per_mile = (dist_meter/1609)/(total_time/3600);

        System.out.println("Speed in Meter per Second is "+meter_per_sec);
        System.out.println("Speed in KiloMeter per Hour is "+km_per_hour);
        System.out.println("Speed in KiloMeter per Mile is "+km_per_mile);

    }
}