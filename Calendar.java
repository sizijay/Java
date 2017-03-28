import java.util.Scanner;



public class Calendar{
  public static void main(String[]args){
    int m;
    int d=1;
    Scanner inp = new Scanner(System.in);
    System.out.println("\nEnter Year :");
    String year = inp.nextLine();
    System.out.println("\nEnter Month :");
    String mon = inp.nextLine();
    System.out.println("\nEnter 1st Day of "+mon+" :");
    String day = inp.nextLine();
    String DAY=day.toUpperCase();
    String MON =mon.toUpperCase();
    
    
    if(DAY.equals("SUNDAY")){
      d=0;
    }
    else if(DAY.equals("MONDAY")){
      d=1;
    }
    else if(DAY.equals("TUESDAY")){
      d=2;
    }
    else if(DAY.equals("WEDNESDAY")){
      d=3;
    }
    else if(DAY.equals("THURSDAY")){
      d=4;
    }
    else if(DAY.equals("FRIDAY")){
      d=5;
    }
    else if(DAY.equals("SATURDAY")){
      d=6;
    }
    
    if(MON.equals("JANUARY") | MON.equals("MARCH") | MON.equals("MAY") | MON.equals("JULY") | MON.equals("AUGUST") | MON.equals("OCTOBER") | MON.equals("DECEMBER")){
      m=31;
    }
    else if(MON.equals("FEBRUARY")){
      m=28;
    }
    else{
      m=30;
    }
   
    
    
    String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    int[][] month = new int[6][7];
    System.out.println("\n\t\t"+MON+" "+year+"\n");
    System.out.println("-----------------------------------------------------------------");
    for(int k=0;k<days.length;k++){
      System.out.print(days[k]+"\t");
    }
    System.out.print("\n");
    int x=1;
    for(int i=0;i<6;i++){
      if(i==0){
        for(int l=0;l<d;l++){
          System.out.print("\t");
        }
        for(int j=d;j<7;j++){
          System.out.print(x+"\t");
          x++;
        }
        
      }
      else{
        for(int j=0;j<7 && x<=m;j++){
          System.out.print(x+"\t");
          x++;
        }
      }
      System.out.print("\n");
    }
  }
}
    
    
    
    