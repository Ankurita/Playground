import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
          int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      if(a>b)
      {
        if(a>c)
        {
          System.out.println(a);
        }
      }
      if(b>a)
      {
        if(b>c)
        {
        System.out.println(b);
        }
      }
      if(c>a)
      {
        if(c>b)
        {
          System.out.println(c);
        }
      }
      // Type your code here
    }
}