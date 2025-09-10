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
System.out.println("you entered: \"" + message+ "\"");
scan.close();
}
}
