public class Members{
  
  static int mon = 1;
  
  public static int InitMem(int m){
    if(m%2!=0){
      return m;
    }
    do{
      m/=2;
      mon++;
    }while(m%2==0);
    return m;
  }
  
  public static void main(String[]args){
    int memb = Integer.parseInt(args[0]);
    System.out.println("\nInitial number of members = "+InitMem(memb)+"\n\nNumber of months the organization has been running = "+mon+"\n");
  }
}