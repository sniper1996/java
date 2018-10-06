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
      System.out.println(" "+n+" postive");
    }
    else if (n < 0)
    {
      System.out.println(" "+n+" negative");
    }
    else 
    {
      System.out.println(" "+n+" not positive or negative");
    }
  }
}
