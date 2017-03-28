import java.util.Scanner;

public class FacIte{
  public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    System.out.println("\nEnter Number:");
    int num = inp.nextInt();
    System.out.println("\nFactorial of "+num+" by Iteration = "+Factorial(num));
  }
  public static int Factorial(int n){
    int fac = 1;
    if (n==1 | n==0){
      return 1;
    }
    else if(n<0){
      return 0;
    }
    else{
      for(int i=1;i<=n;i++){
        fac*=i;
      }
      return fac;
    }
  }
}