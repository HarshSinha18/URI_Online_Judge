import java.util.Scanner;
public class Ages{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ages = 0;
    int sum = 0;
    int count = 0;
    //float avg = 0;
    System.out.println("Enter Ages : ");
    for(int i= 0 ; i<= 1000 ; i++){
      ages = sc.nextInt();
      if (ages<0)
      break;
      count++;
      sum+=ages;
      
    }
    System.out.println("Average : " +(double)sum/count);
  }
}
