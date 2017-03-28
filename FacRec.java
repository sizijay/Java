import java.util.Scanner;

public class FacRec{
  public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    System.out.println("\nEnter Number:");
    int num = inp.nextInt();
    System.out.println("\nFactorial of "+num+" by Recursion = "+Factorial(num));
  }
  public static int Factorial(int n){
    if (n==1 | n==0){
      return 1;
    }
    else{
      return n*Factorial(n-1);
    }
  }
}
