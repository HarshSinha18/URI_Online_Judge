import java.util.Scanner;
public class Division{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
double ans = 0;
double a = 0;
double b = 0;
System.out.print("Enter n : ");
int n = sc.nextInt();
System.out.println("Now Enter Number : ");
for(int i = 1 ; i<=n ; i++){
a = sc.nextDouble();
b = sc.nextDouble();
ans = a/b;
if(b==0)
System.out.println("Not Possible");
else
System.out.println("Ans = "+ans);
}
}
}
