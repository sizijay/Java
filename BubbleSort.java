import java.util.Scanner;

class BubbleSort{
  public static void main(String []args){
    Scanner inp = new Scanner(System.in);
    System.out.println("\nEnter the Number of elements to be sorted : ");
    int n = inp.nextInt();
    
    int[] array = new int[n];
    
    Scanner io = new Scanner(System.in);
    System.out.println("Enter the elements seperated by ,\n");
    String in = io.nextLine();
    String[] tempA = in.split(",");
    
    for (int i = 0; i < tempA.length; i++) {
        array[i] = Integer.parseInt(tempA[i]);
    }
    
    System.out.println("\nNumbers to sort>>>\n");
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+"   ");
    }
    int count = array.length;
    boolean flag;
    for(int i=0;i<count-1;i++){
      flag = false;
      for(int j=0;j<count-1;j++){
        if(array[j]>array[j+1]){
          int temp=array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
          flag =true;
        }
      }
      if(flag==false){
        break;
      }
    }
    System.out.println("\n\n\nAfter Sorting with Bubble Sort......\n");
    for(int i=0;i<count;i++){
      System.out.print(array[i]+"  ");
    }
    System.out.println("\n");
  }
}