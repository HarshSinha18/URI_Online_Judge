import java.util.Scanner;
public class ques{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int high = 0;
int i;
System.out.print("Enter N: ");
int n = sc.nextInt();
for( i = 0; i<n ; i++){
System.out.print("Enter Number: ");
int num = sc.nextInt();
if(high<=num)
high = num;
}
System.out.print("High Number among all Number are: "+high);
}
}

