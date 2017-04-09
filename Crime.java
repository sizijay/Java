import java.util.Scanner;

public class Crime{
  public static String Prime(int d){
    int d2=d/2;
    if(d==1){
      return "\nThere will NOT be a Crime scene on ";
    }
    for(int i=2;i<=d2;i++){
      if(d%i==0){
        return "\nThere will NOT be a Crime scene on ";
      }
    }
    return "\nThere will be a Crime scene on ";
  }
  
  public static void main(String[]args){
    Scanner inp = new Scanner(System.in);
    int date=-79;
    do{
      if(date!=-79){
        System.out.println("\nPlease enter a valid date (1-31) >>> ");
      }
      else{
        System.out.println("\nEnter ta date to check whether there will be a Crime >>> ");
      }
      date = inp.nextInt();
    }while(date<1 || 31<date);
    System.out.println(Prime(date)+date+".....\n");
  }
}