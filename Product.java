import java.util.Scanner;
public class Product {
    int pcode,price;
    String pname;
    Product(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the product code");
        pcode= s.nextInt();
        System.out.println("enter the product name");
        pname=s.next();
        System.out.println("enter the price");
        price= s.nextInt();
    }
    public void display(){
        System.out.println("The details of the product which has lowest price ");
        System.out.println("product code is" +pcode);
        System.out.println("product name is" +pname);
        System.out.println("product price is" +price);
    }
    
     public static void main(String[] args) {
         Product p1=new Product();
         Product p2=new Product();
         Product p3=new Product();
         if(p1.price<p2.price && p1.price<p3.price)
             p1.display();
         else if(p2.price<p1.price &&p2.price<p3.price )
             p2.display();
         else
             p3.display();
             
     }
        
}
