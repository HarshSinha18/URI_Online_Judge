import java.util.Scanner;
public class Ques_1180{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Test Case : ");
    int n = sc.nextInt();
    int a[] = new int[n];
    int index_position = 0;
    int minimum = 10000;
    for(int i = 0; i< n ; i++){
      a[i] = sc.nextInt();
      
      if(minimum>= a[i])
      minimum = a[i];
     
    }
    for(int i = 0 ; i<n ;i++){
      if(a[i] == minimum)
      index_position = i;
    }
    System.out.println("Minimum Value " +minimum);
    System.out.println("Position "+index_position);
  }
}
