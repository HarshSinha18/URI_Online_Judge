import java.util.Scanner;
public class Ques_1172{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int a[] = new int[10];
for(int i = 0 ; i<a.length; i++){
a[i] = sc.nextInt();
if(a[i] <= 0)
a[i] =1;
}
for(int i = 0 ; i< a.length ; i++){
System.out.println("a["+i+"] = " +a[i]);
}
}
}
