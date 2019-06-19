import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sq;
    sq=n*n;
    return sq;
  }

	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int d=square(m);
      System.out.println(d);
    }
}

	 // Type your code here   