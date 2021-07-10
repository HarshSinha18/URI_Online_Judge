import java.util.Scanner;
public class Array_Change{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int i = 0;
int h = 0;
int s = 0;
int a[] = new int[6]; 
System.out.println("Enter Number ");
for(i = 0 ;i<5 ;i++){
a[i] = sc.nextInt();
}
for(h = 5 ;h>=0 ;h--){
if(h ==0)
break;
s+=1;
System.out.println("a["+(s-1)+"] = " +a[h-1]);
}
}
}

//Dimag ka dahi kr diya ye Ques🤒🤒//
//But Kr ke Accha Lga ☺️//
