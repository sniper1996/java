import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    int n;
    Scanner s= new Scanner(System.in);
    n = s.nextInt();
    if(n > 0)
    {
      System.out.println(" The given number "+n+" is postive");
    }
    else if (n < 0)
    {
      System.out.println("The given number "+n+" is a negative");
    }
    else 
    {
      System.out.println("The given number  "+n+" is neither positive or negative");
    }
  }
}
