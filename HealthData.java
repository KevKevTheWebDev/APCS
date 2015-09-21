import java.util.Scanner;

public class HealthData {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
      int userAgeMinutes;
      int userAgeSeconds;
      int userREALSeconds;
      int userHeartBeats;
      int userSneezes;
      int userCalories;
      int userSpittle;
      
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
      
      System.out.println("You are " + userAgeYears + " years old.");
      
      //MINUTES
      
      userAgeMinutes = userAgeDays * 24 * 60;
      
      System.out.println("You are " + userAgeMinutes + " minutes old.");
      
      
      //SECONDS
      
      userAgeSeconds = (3600*(userAgeDays*24));
      
      System.out.println("You are " + userAgeSeconds + " seconds old.");
      
      //HEARTBEATS
      
      userHeartBeats = 37843200 * userAgeYears;
      System.out.println("Your heart has beat maybe " + userHeartBeats + " times in your hears of living!");
      
      //SNEEZES
      userSneezes = 950 * userAgeYears;
      System.out.println("You have maybe sneezed " + userAgeSeconds + " times in your years of living!");

      //CALORIES
      
      userCalories = 730000*userAgeYears;
      System.out.println("You have intaken " + userCalories + " calories in your years of living!");
      
      //HOW MUCH SPITTLE HAVE YOU PRODUCED? :D
      
      userSpittle = 730 * userAgeYears;
      System.out.println("You have produced " + userSpittle + " liters of spit in " + userAgeYears + " years! :D");

      //ACCURATE SECONDS
      
      //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").;
      
      
      
      return;
   }
}
