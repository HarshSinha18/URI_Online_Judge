public class Sequence{
public static void main(String[] args){
int a = 1;
double remain = 0;
double  sum = 0;
for(int b = 2 ; b<= 100 ; b++){
remain = (double)1/b;
sum +=remain;
}
System.out.println((double)a+sum);
}
}
