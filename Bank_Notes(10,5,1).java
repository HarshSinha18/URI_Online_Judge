import java.util.Scanner;
public class Ques{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a = 10;
int b = 5;
int c = 1;
int a_count = 0;
int b_count =0 ; 
int c_count  = 0; 
int a_remain =0;
int b_remain = 0;
int a_remain_m = 0;
int b_remain_m = 0;
int x = 0;
System.out.print("Enter Number : ");
int n = sc.nextInt();
while(a<= n){
a+=10;
a_count++;
a_remain= 10*a_count;
}
System.out.println("10: "+a_count+" number of  Note/coins required.");
a_remain_m = n-a_remain;
while(b<= a_remain_m){
b+=5;
b_count++;
b_remain = 5*b_count;
}
System.out.println("5 : "+b_count+" number of Note /coin required.");
x = a_remain+b_remain;
b_remain_m = n-x;
while(c<= b_remain_m){
c+=1;
c_count++;
}
System.out.println("1 : "+c_count+ " number of  Note /coin required.");
}
}
