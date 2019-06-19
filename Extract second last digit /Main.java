import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n%10000;
      int b=a%1000;
      int c=b%100;
      int d=c/10;
      System.out.println(d);// Type your code here
	}
}