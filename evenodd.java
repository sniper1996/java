import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("enter a number: ");
    int num = reader.nextInt();
    if (num % 2 == 0)
    System.out.println( " even");
    else
    System.out.println( " odd");
  }
}