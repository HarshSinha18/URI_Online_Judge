import java.util.Scanner;
public class Pum{
public static void main(String[]args){
Scanner sc = new Scanner (System.in);
for(int z = 0 ; z<= 1000 ; z++){
System.out.print("Enter N : ");
int n = sc.nextInt();
for(int i = 1 ; i<= n ; i++){
System.out.print(i+" ");
}
System.out.println();
if(n==0)
break;
}
}
}
