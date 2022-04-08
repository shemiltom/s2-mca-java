
import java.util.Scanner;
public class String_manipulate {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine();
        System.out.println("Length of string=" +str1.length());
        System.out.println("Character at first position=" +str1.charAt(0));
        System.out.println("Lowecase=" +str1.toLowerCase());
        System.out.println("Uppercase=" +str1.toUpperCase());
        System.out.println("String ends with e : "+str1.endsWith("e"));
        System.out.println("Replace'hello' with 'hai' : "+str1.replaceAll("hello","hai"));
    }
    
}
