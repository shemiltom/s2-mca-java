import java.util.Scanner;
public class Complex {

    double real;
            double imaginary;
            
            Complex(){}
            Complex(double real,double imaginary){
                this.real = real;
                this.imaginary = imaginary;
            }
            public static Complex sum(Complex a, Complex b){
                Complex ans = new Complex();
                ans.real = a.real + b.real;
                ans.imaginary = a.imaginary + b.imaginary;
                return ans;
            }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
            Complex num1 = new Complex();
            Complex num2 = new Complex();
            System.out.println("Enter first complex number: \nreal: ");
            num1.real = sc.nextDouble();
            System.out.println("\nimaginary: ");
            num1.imaginary = sc.nextDouble();
            System.out.println("Enter Second complex number: \nreal: ");
            num2.real = sc.nextDouble();
            System.out.println("\nimaginary: ");
            num2.imaginary = sc.nextDouble();
            
            Complex answer = sum(num1,num2);
            System.out.println("The addition of two complex numbers is : "+answer.real+" + "+answer.imaginary+"i");
            
        }
        
    }
