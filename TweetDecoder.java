
import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";
      String origWholeTweet = "";
      String tester = "";
      
            
      System.out.println("Enter an abbreviation from a tweet,\nOr enter an entire tweet, and I'll decode it for you!");
      origTweet = scnr.next();
      origWholeTweet = scnr.nextLine();
      
      
      if(origWholeTweet.equals("")){
      if (origTweet.equalsIgnoreCase("LOL")) {
         System.out.println("LOL = laughing out loud");
      }
      else if (origTweet.equalsIgnoreCase("LLO") || (origTweet.equalsIgnoreCase("LPL"))) {
         System.out.println("Did you mean 'LOL'? 'LOL' = laughing out loud");
      }
      
      else if (origTweet.equals("BFN")) {
         System.out.println("BFN = bye for now = bye for now");
      }
      else if (origTweet.equalsIgnoreCase("BNM") || (origTweet.equalsIgnoreCase("BFM"))) {
         System.out.println("Did you mean 'BFN'? 'BFN' = bye for now");
      }
      
      else if (origTweet.equals("FTW")) {
         System.out.println("FTW = for the win");
      }
      else if (origTweet.equalsIgnoreCase("LLO") || (origTweet.equalsIgnoreCase("LPL"))) {
         System.out.println("Did you mean 'LOL'? 'LOL' = laughing out loud");
      }
      
      else if (origTweet.equals("IRL")) {
         System.out.println("IRL = in real life");
      }
      else if (origTweet.equalsIgnoreCase("ILR") || (origTweet.equalsIgnoreCase("URL"))) {
         System.out.println("Did you mean 'IRL'? 'IRL' = in real life");
      }
      
      else if (origTweet.equals("TYT")) {
         System.out.println("TYT = take your time");
      }
      else if (origTweet.equalsIgnoreCase("TTY") || (origTweet.equalsIgnoreCase("RTY"))) {
         System.out.println("Did you mean 'TYT'? 'TTY' = take your time");
      }
      
      else if (origTweet.equals("ROFL")) {
         System.out.println("ROFL = rolling on the floor laughing");
      }
      else if (origTweet.equalsIgnoreCase("ROLF") || (origTweet.equalsIgnoreCase("RPFL"))) {
         System.out.println("Did you mean 'ROFL'? 'ROFL' = rolling on the floor laughing");
      }
      else if (origTweet.equals("BRB")) {
         System.out.println("BRB = be right back");
      }
      else if (origTweet.equalsIgnoreCase("BBR") || (origTweet.equalsIgnoreCase("BRN"))) {
         System.out.println("Did you mean 'BRB'? 'BRB' = be right back");
      }
      
      
      else if (origTweet.equals("MEOW")) {
         System.out.println("MEOW = CAT NOISE. ~(>^-^)>");
      }
      else if (origTweet.equalsIgnoreCase("MAOW") || (origTweet.equalsIgnoreCase("MEEOWW"))) {
         System.out.println("True.");
      }
      
      else {
         System.out.println("Sorry, don't know that one.");
      }
      }
      
                  
      //NOW FOR THE TWEET THINGY
      
      
      
      if (origWholeTweet.indexOf("LOL")!=-1 ) {
      
      int LIONS = (origWholeTweet.indexOf("LOL"));
      int TIGERS = (LIONS + 3);
      
      System.out.println(origWholeTweet.substring(LIONS,TIGERS);
      
      
        // System.out.println(origWholeTweet.substring(indexOf("LOL")),lastIndexOf("LOL"));
         
      }
      
      
     /* else if (origWholeTweet.equalsIgnoreCase("LLO") || (origWholeTweet.equalsIgnoreCase("LPL"))) {
         System.out.println("Did you mean 'LOL'? 'LOL' = laughing out loud");
      }*/

      
      
      
      
      return;
   }
}
