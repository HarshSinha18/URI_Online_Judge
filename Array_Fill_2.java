import java.util.Scanner;
public class Array_Fill_2 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
int a[] = new int[100];
System.out.print("Enter N : ");
int n = sc.nextInt();
for(int i = 0 ; i< 100 ; i++){
if(i%n == 0){
a[i] = 0;
}
else{
a[i] = i;
}
}
for(int i = 0; i< 100 ; i++){
System.out.println("a["+i+"] = "+a[i]);
}
}
}
