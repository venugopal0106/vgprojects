import java.util.Scanner;

public class AlphabetsCounterInSentence {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sen = sc.nextLine();
    String Sentence =sen.toUpperCase();
    // String sen ="THE QUICK BROWN FOX JUMPS OVER THE LAZY BLACK DOG";
    // System.out.println(sen);
    int count=0;
    for(char ch ='A';ch<='Z';ch++){
        for(int i=0;i<Sentence.length();i++)
        {
        if(ch==Sentence.charAt(i)){
        count++;
        }
        }
        if (count!=0){
            System.out.println(ch+" :"+count);
        }
        
        count=0;
    }
    for(int i=0;i<sen.length();i++)
        {
        if(Sentence.charAt(i)==' '){
        count++;
        }    
    }
    System.out.println("Spaces:"+count);
            
    }
    }

