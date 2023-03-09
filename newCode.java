import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;
//import java.util.ArrayList;
import java.util.Random;
import java.util.*;
class newCode {

  public static void main(String[] arguments) {
    // You will start the conversation here.

    System.out.println("Hey! Hows it going?");
    // asks user how many rounds to play
    Scanner input = new Scanner(System.in);
    System.out.println("how many rounds");

    int rounds = input.nextInt();
    

    String[] transcript = new String[rounds * 2 + 2];
    input.nextLine();
    transcript[0] = "ask a question";
    System.out.print(transcript[0]);

    int round;
    for (round = 0; round < rounds; round++) {
      System.out.println("****Round****" + round);
      String computer_response = "";
      String statement = input.nextLine();

      transcript[2 * round + 1] = statement + " ";

      String[] str = statement.split(" ");
      boolean ans=false;
       
        for (int j = 0; j < str.length; j++) {
          String word;
          word = str[j];
          System.out.print("starting word" + word + "->");
          if (word.equals("I")) {
            // trying to replace i with updated word
            word = ("You");
            ans=true;
            //computer_response += word;
          } else if (word.equals("me")) {
            // trying to replace i with updated word
            word = ("you");
            ans=true;
            //computer_response += word;
          } else if (word.equals("you")) {
            // trying to replace i with updated word
            word = ("me");
            ans=true;
            //computer_response += word;
          } else if (word.equals("am")) {
            // trying to replace i with updated word
            word = ("are");
            ans=true;
            //computer_response += word;
          } else if (word.equals("my")) {
            // trying to replace i with updated word
            word = ("Your");
            ans=true;
            //computer_response += word;
          } else if (word.equals("your")) {
            // trying to replace i with updated word
            word = ("my");
            ans=true;
            //computer_response += word;
          } else if (word.equals("are")) {
            // trying to replace i with updated word
            word = ("am");
            ans=true;}
          computer_response += word + " ";}
        transcript[2 * round + 2] = computer_response;
          

        if (ans==false) {
          ArrayList < String > rand_response = new ArrayList < String > ();
          rand_response.add("wow");
          rand_response.add("really?");
          rand_response.add("interesting...");
          rand_response.add("so cool!");

          System.out.println("INSIDE IF STatemnt");
          Random random_item = new Random();
          for (int i = 0; i < rand_response.size(); i++) {
            int index = random_item.nextInt(rand_response.size());
            //System.out.println("RANDOM RESPONSE IS:" + rand_response.get(index));
            computer_response = rand_response.get(index);
            transcript[2 * round + 2] = computer_response;}
        }
   

    
      System.out.println(transcript[2 * round + 2]);
      }
      System.out.println("transcript");
      System.out.print(transcript);

      for (String line: transcript) {
        System.out.println(line);
      
      input.close();
      // close main
      }
    // close class
  }}

