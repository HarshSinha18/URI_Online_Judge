import java.util.Scanner;
public class Perfect_Number{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int sum =0;
int ans1 = 0;
System.out.print("Enter Test Case: ");
int t_c = sc.nextInt();
for(int c = 1 ; c<= t_c ;  c++){
System.out.print("Enter Number: ");
int n = sc.nextInt();
for(int i = 1 ; i<=10 ; i++){
if(n%i==0)
sum+=i;
}
if(sum>n)
ans1 = sum-n;
else
ans1 = n-sum;
if(ans1>n){
if(ans1%n==0)
System.out.println(+n+" is Pefect Number");
else
System.out.println(+n+" is not Perfect Number");
}else{
if(n%ans1==0)
System.out.println(+n+ " is Perfect Number");
else
System.out.println(+n+" is not Perfect Number ");
}
}
}
}
