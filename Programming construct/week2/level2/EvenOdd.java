import java.util.*;
public class EvenOdd{
 public static void main(String[] args) {
int num1=1;
Scanner input = new Scanner(System.in);
int num2;
System.out.println("num2: ");
num2 = input.nextInt();
if(num2<0){
System.out.println("Input is not a natural number");
}
else{
for(int i=1;i<num2;i++){
if(i%2==0){
System.out.println(i + "is an even number ");
}
else{
System.out.println(i + "is an odd number");
}}}}
}
