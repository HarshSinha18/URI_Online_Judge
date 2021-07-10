import java.util.Scanner;
public class number{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int sum = 0;
int count = 0;
int z=0;
int max= 0;
System.out.println("Enter Number: ");
int n = sc.nextInt();
for(int i = 0 ; i<= 1000 ; i++){
z = sc.nextInt();
if(n<z)
break;
}
if(max<=z)
max=z;
for(int w= n ; w<= max ; w++){
sum+=w;
count++;
if(sum>max)
break;
}
System.out.println(count);
}
}
