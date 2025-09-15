import java.util.Random;
import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
System.out.println(" AA   SSS");
System.out.println("A  A S  ");
System.out.println("A  A  SSS");
System.out.println("AAAA     S");
System.out.println("A  A  SSS ");
String message;
Scanner scan = new Scanner(System.in);
System.out.println("enter a 5 letter string:");
message=scan.nextLine();
String shortened= message.substring(1, 4);
var mirrored1 = shortened.charAt(2);
var mirrored2 = shortened.charAt(1);
var mirrored3 = shortened.charAt(0);
int fahrenheit;
System.out.println("give a number in Fahrenheit");
fahrenheit=scan.nextInt();
var celcius= (fahrenheit -32)* (5.0/9.0);
Random generator = new Random();
int randnum;
randnum=generator.nextInt(16384)+1+32;
System.out.println("your entire string is:"+celcius+mirrored1+mirrored2+mirrored3+randnum);
scan.close();
}
}
