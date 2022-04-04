import java.util.Scanner;
import sun.management.counter.StringCounter;
public class Sort 
{
    public static void main(String[] args)
    {
 
    int count;
    String temp;
    Scanner n=new Scanner(System.in);
    System.out.println("enter number of string to be inserted:");
    count=n.nextInt();
    String str[]=new String[count];
    Scanner n2=new Scanner(System.in);
    System.out.println("enter the strings:");
    for(int i=0;i<count;i++)
    {
        str[i]=n2.nextLine();
        
    }
    n.close();
    n2.close();
    for(int i=0;i<count;i++)
    {
        for(int j=i+1;j<count;j++)
        {
            if(str[i].compareTo(str[j])>0)
            {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
        System.out.println("String in sorted order is:");
        for(int i=0;i<=count-1;i++)
        {
            System.out.println(str[i]+",");
        }
        }
           
}