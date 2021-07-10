import java.util.Scanner;
public class even{
public static void main ( String[] args){
Scanner sc = new Scanner(System.in);
int count = 0;
System.out.println("Enter Number: ");
for(int i= 0 ; i<5 ; i++){
int n = sc.nextInt();
if(n%2==0)
count++;
}
System.out.println("Number Of Even Number among all are : " +count);
}
}
