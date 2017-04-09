import java.util.Scanner;

public class StairCase{
  public static void Stair(){
    for(int i=0;i<5;i++){
      if (i==4){
        System.out.println("* * * *");
      }
      else{
        System.out.println("      *");
      }
    }
  }
  
  public static void StairX(int s,int m){
    for(int i=0;i<s;i++){
      for(int j=0;j<5;j++){
        for(int k=0;k<(7*(s-i-1));k++){
          System.out.print(" ");
        }
        if (i==m){
          PlaceMan.Mann2(j);
        }
        else{
          if (j==4){
            System.out.println("* * * *");
          }
          else{
            System.out.println("      *");
          }
        }
      }
    } 
  }
  
  public static void Mann(){
    for(int i=0;i<5;i++){
      if (i==0){
        System.out.println("   0  *");
      }
      else if (i==1){
        System.out.println("  /|\\ *");
      }
      else if (i==2){
        System.out.println("   |  *");
      }
      else if (i==3){
        System.out.println("  / \\ *");
      }
      else{
        System.out.println("* * * *");
      }
    }
  }
  
  
  
  public static void main(String[]args){
    System.out.println("\nQuestion 01 >>>\n");
    Stair();
    System.out.println("\n\nQuestion 02 >>>\n");
    StairX(5,-1);
    System.out.println("\n\nQuestion 03 >>>\n");
    Mann();
    Scanner inp = new Scanner(System.in);
    //System.out.println("\nEnter the total no. of steps... ");
    //int s=inp.nextInt();
    System.out.println("\nQuestion 04 >>>\n");
    int m =0;
    do{
      System.out.println("\nEnter the step no. (1-5)to place man... ");
      m=inp.nextInt();
    }while(m<1 || 5<m);
    System.out.println("");
    StairX(5,5-m);
  }
}