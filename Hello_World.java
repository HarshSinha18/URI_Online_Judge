class hwo{
String hw;
public void set_data(String hws){
hw = hws;
}
public void display (){
System.out.println(hw);
}
}
public class Ques_1{
public static void main(String []  args){
hwo s1  =  new hwo();
s1.set_data("Hello World");
s1.display();
}
}
