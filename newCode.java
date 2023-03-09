import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
class newCode {

/**
 * main which will run Chatbot
 * @param arguments given arguemnts in command line 
 */
  public static void main(String[] arguments) {

    System.out.println("Hey! Hows it going?");
    // asks user how many rounds to play
    Scanner input = new Scanner(System.in);
    System.out.println("How many rounds?: ");
    int rounds = input.nextInt();
    

    String[] transcript = new String[rounds * 2 + 1];
    input.nextLine();
    transcript[0] = "Ask a question: ";
    System.out.print(transcript[0]);

    int round;
    for (round = 0; round < rounds; round++) {
      String computer_response = "";
      String statement = input.nextLine();
      transcript[2 * round + 1] = statement + " ";
      String[] str = statement.split(" ");
      boolean ans=false;
       
        for (int j = 0; j < str.length; j++) {
          String word;
          word = str[j];
          
          if (word.equals("I")) {
            word = ("You");
            ans=true;           
          } else if (word.equals("me")) {
            word = ("you");
            ans=true;        
          } else if (word.equals("you")) {
            word = ("me");
            ans=true;          
          } else if (word.equals("am")) {           
            word = ("are");
            ans=true;           
          } else if (word.equals("my")) {          
            word = ("Your");
            ans=true;            
          } else if (word.equals("your")) {            
            word = ("my");
            ans=true;            
          } else if (word.equals("are")) {            
            word = ("am");
            ans=true;}
          computer_response += word + " ";}
        transcript[2 * round + 2] = (computer_response+ "?");
        System.out.println(transcript[2 * round + 2]);
        

        if (ans==false) {
          ArrayList < String > rand_response = new ArrayList < String > ();
          rand_response.add("wow");
          rand_response.add("really?");
          rand_response.add("interesting...");
          rand_response.add("so cool!");
  
          Random random_item = new Random();
          for (int i = 0; i < rand_response.size(); i++) {
            int index = random_item.nextInt(rand_response.size());
            computer_response = rand_response.get(index);
            transcript[2 * round + 2] = computer_response;}
            System.out.println(transcript[2 * round + 2]);
        }
      }
      System.out.println("         ");
      System.out.println("Transcript:");
      System.out.println("         ");
       for (String line: transcript) {
         System.out.println(line);
      
      input.close();
      // close main
      }
    // close class
  }}

