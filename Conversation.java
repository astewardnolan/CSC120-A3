import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
   
    // asks user how many rounds to play
    System.out.println("how many rounds");
    Scanner input= new Scanner (System.in);
    double rounds= input.nextDouble();
    Scanner input1;
    String response;
    Random r= new Random();

  // list of statements and resposnes for transcript
    
  ArrayList<String> transcript = new ArrayList<String>();
  
// print greeting,  

    System.out.println("Hey! Hows it going?");

  //list of random responses for else statement
    ArrayList<String> rand_response = new ArrayList<String>();
    rand_response.add("wow");
    rand_response.add("really?");
    rand_response.add("interesting...");
    rand_response.add("so cool!");
    
    
    //random method loop
    /* method to randomly select index from Arraylist rand_resposne
     * 
     */
     Random random_method = new Random(); {
      for (int i = 0; i < rand_response.size(); i++)
      {
        int index = random_method.nextInt(rand_response.size());
      }

    /*For loop depending on amount of rounds entered by user
     * 
     */
    for (int i=0; i<= rounds; i++ ){
      String statement = input.next(); 
      transcript.add(statement);
      
      //need to split the sentence
      String str[] = statement.split(" ");
  /* for loop depedning on amount of words in statment
   * 
   */
      for (int j=0; j<str.length; j++){ 
        
        String word;
        word= str[j];
        if(word.equals("I")){
          // trying to replace i with updated word
          word= ("You");}
        else if (word.equals("me")){
            // trying to replace i with updated word
          word= ("you");}
        else if (word.equals("you")){
            // trying to replace i with updated word
          word= ("me");}
        else if(word.equals("am")){
            // trying to replace i with updated word
          word= ("are");}
        else if(word.equals("I")){
            // trying to replace i with updated word
          word= ("You");}
        else if(word.equals("my")){
            // trying to replace i with updated word
          word= ("Your");}
        else if(word.equals("your")){
            // trying to replace i with updated word
          word= ("my");}
      transcript.add(word);
      
      if (statement.equals(str)) {  
      
        transcript.add(index);
      
       
       
        

System.out.println(transcript);
   
    }}}
System.out.println("Goodbye!");}}}

    
  
  

      






    