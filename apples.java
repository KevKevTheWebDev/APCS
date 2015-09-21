# APCS
import java.util.Scanner;
import java.io.*;

public class apples{
	public static void main(String args[]){
   Scanner words = new Scanner(System.in);
   
         String askNoun = "Enter a noun please: ";
         System.out.println(askNoun);
   		String Noun = words.nextLine();
         
         String askPNoun = "Enter a plural noun: ";         
         System.out.println(askPNoun);
         String PNoun = words.nextLine();
         
         String askNoun2 = "Enter another noun: ";
         System.out.println(askNoun2);
         String Noun2 = words.nextLine();
         
         String askPlace = "Enter the name of a place: ";
         System.out.println(askPlace);
         String Place = words.nextLine();
         
         String askAdj = "Enter an adjective: "; 
         System.out.println(askAdj);
         String Adj = words.nextLine();
         
         
         String askNoun3 = "Enter one last noun: ";
         System.out.println(askNoun3);
       	String Noun3 = words.nextLine();
         
         String askFavChar = "btw whats your favorite letter? ";
         System.out.println(askFavChar);
       	String favChar = words.nextLine();
      
      System.out.println("Be kind to your " + Noun + "-footed " + PNoun);
      System.out.println("For a duck may be somebody's " + Noun2 + ",");
      System.out.println("Be kind to your " + PNoun + " in " + Place);
      System.out.println("Where the weather always stays " + Adj);
      System.out.println("You may think this is the " + Noun3 + ",");
      System.out.println("Well it is.");
      
      System.out.println("Also your favorite character, " + favChar + " shows up " + int                    +" times in this MadLib!");
     
	}
}
