import java.util.Scanner;
public class Ques_1172{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int p = n;
int a[] = new int[10];
System.out.println("a[0] = "+n);
for(int i = 1 ; i<10 ; i++){
a[i] = 2*p;
p = a[i];
}
for(int i= 1 ; i<10 ; i++){
System.out.println("a["+i+"] = " +a[i]); 
}
}
}
