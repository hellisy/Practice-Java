import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class VowelOrNot {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       String[] v = {"A","a","E","e","I","i","O","o","U","u","Y","y"};
       System.out.print("Please insert a letter... \n" );
       String l = console.nextLine();
       boolean result = Arrays.stream(v).anyMatch(l::equals);
       int limit = 1;
       if (l.length() == limit && l instanceof String){
           if (result){
               System.out.print("Letter is a Vowel...");
           } else{
               System.out.print("Letter is a Consonant...");
           }
           
       } else {
        System.out.print("Error Message : The length is bigger than 1 Or Not a Letter..." );
        return;
       }


    }
}