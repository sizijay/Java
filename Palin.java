import java.util.Scanner;

public class Palin{
 public static void main(String[]args){
  Scanner inp = new Scanner(System.in);
  System.out.println("/nEnter Number:");
  String num=inp.nextLine();
  char[] x = num.toCharArray();
  if(isPalin(x)){
   System.out.println("\nThe Number is Palindrome\n");
  }
  else{
   System.out.println("\nThe Number is NOT Palindrome\n");
  }
 }

 public static boolean isPalin(char[] num){
  for(int i=0;i<=(num.length/2);i++){
   if(num[i]!=num[num.length-i-1]){
    return false;
   }
  }
  return true; 
 }
  
}
