import java.util.Scanner;
public class Ques{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int pos = 0;
    int neg = 0;
    int even = 0;
    int odd = 0;
    System.out.println("Enter Number : ");
    for(int i = 0 ; i< 5 ; i++){
    int n = sc.nextInt();
      if(n>0)
      pos++;
      if(n<0)
      neg++;
      if (n%2==0)
      even++;
      else
      odd++;
      }
    System.out.println("positive : "+pos);
    System.out.println("Negative : "+neg);
    System.out.println("Odd : "+odd);
    System.out.println("Even : "+even);
  }
}
