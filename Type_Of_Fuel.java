import java.util.Scanner;
public class Fuel{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" 1. Alcohal "+"\n"+" 2. Gasoline  "+"\n"+" 3. Disel  " +"\n"+" 4. Exit " );
int alcohal = 1;
int gasoline = 1;
int  disel = 1;
int alcohal_c = 0;
int gasoline_c = 0;
int disel_c = 0;
int num = 0;
for(int i = 0; i<= 1000 ; i++){
System.out.print("Enter Number: ");
num = sc.nextInt();
if(num== 4)
break;
if (num>4)
System.out.println("Invalid Output");
if (num==1) 
alcohal_c+=alcohal;
if (num==2)
gasoline_c+=gasoline;
if(num==3)
disel_c+=disel;
}
System.out.println("Alcohal: "+alcohal_c);
System.out.println("Gasoline: "+gasoline_c);
System.out.println("Disel: "+disel_c);
} 
}
