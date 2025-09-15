import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
System.out.println("please give a base from 2 to 9:");
int baseInputted = scan.nextInt();
int maxNumber=((baseInputted-1)*baseInputted*baseInputted*baseInputted)+
((baseInputted-1)*baseInputted*baseInputted)+
((baseInputted-1)*baseInputted)+((baseInputted-1));
System.out.println("the maximum value of a base "+baseInputted+
" number with 4 digits in base 10 is: "+maxNumber );
System.out.println("Please choose a number from 0 to "+maxNumber+
" to convert into base "+baseInputted);
int numberInputted = scan.nextInt();
int remainder1= numberInputted%baseInputted;
int division1= numberInputted/baseInputted;
int remainder2= (division1%baseInputted)*10;
int division2= division1/baseInputted;
int remainder3= (division2%baseInputted)*100;
int division3= division2/baseInputted;
int remainder4= (division3%baseInputted)*1000;
int inputIntoGivenBase=remainder1+remainder2+remainder3+remainder4;
System.out.println(numberInputted+" base 10= "+inputIntoGivenBase+" base "+baseInputted);
scan.close();
  }
}
