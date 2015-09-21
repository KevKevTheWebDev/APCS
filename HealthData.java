import java.util.Scanner;

public class HealthData {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
      int userAgeMinutes;
      int userAgeSeconds;
      int userREALSeconds;
      
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
      
      System.out.println("You are " + userAgeYears + " days old.");
      
      //MINUTES
      
      userAgeMinutes = userAgeDays * 24 * 60;
      
      System.out.println("You are " + userAgeMinutes + " minutes old.");
      
      
      //SECONDS
      
      userAgeSeconds = (3600*(userAgeDays*24));
      
      System.out.println("You are " + userAgeSeconds + " seconds old.");

      //ACCURATE SECONDS
      
      //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").;
      
      
      
      return;
   }
}
