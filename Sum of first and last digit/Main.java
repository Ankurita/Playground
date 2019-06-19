import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   
       Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
      int ld,r,rev=0,fd=0,s;

        ld = n % 10;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        fd = rev % 10;
        s = fd + ld;

        System.out.println(s);
    }
}
