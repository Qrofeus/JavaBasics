package Practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static ArrayList<String> magicReply=new ArrayList<>();
    public static void main(String[] args) {
        //Magic 8 Ball Replies
        magicReply.add("As I see it, yes.");
        magicReply.add("Ask again later.");
        magicReply.add("Better not tell you now.");
        magicReply.add("Cannot predict now.");
        magicReply.add("Concentrate and ask again.");
        magicReply.add("Don't count on it.");
        magicReply.add("It is certain.");
        magicReply.add("It is decidedly so.");
        magicReply.add("Most likely.");
        magicReply.add("My reply is No.");
        magicReply.add("My sources say No.");
        magicReply.add("Outlook is not so good");
        magicReply.add("Outlook good.");
        magicReply.add("Reply hazy. Try again.");
        magicReply.add("Signs point to yes.");
        magicReply.add("Very doubtful.");
        magicReply.add("Without a doubt.");
        magicReply.add("Yes.");
        magicReply.add("yes. Definitely.");
        magicReply.add("You may rely on it.");

        String newText;
        Scanner scn=new Scanner(System.in);

        do {
            System.out.println("Enter your Question..");
            newText = scn.nextLine();
            if(newText.endsWith("?")){
                magicBall();
            }else {
                System.out.println("Not a Question...");
            }
        }while(!newText.equals("exit"));
    }

    public static void magicBall(){
        Random rnd=new Random();
        System.out.println(magicReply.get(rnd.nextInt(magicReply.size())));
    }
}
