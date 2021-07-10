import java.util.Scanner;
public class Ques_1{
public static void main(String[]args){
Scanner sc= new Scanner(System.in);
int num= 0;
int sum = 0;
System.out.print("Enter N: ");
int n = sc.nextInt();
System.out.print("Now Enter Number : ");
for(int i = 1 ; i<= n ; i++){
num= sc.nextInt();
if(num>0)
sum+=num;
}
System.out.println("Sum : "+sum);
}
}
