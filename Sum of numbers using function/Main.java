import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int i,sum1=0;
    for(i=1;i<=n;i++){
    sum1=sum1+i;
      
      
    }
    return sum1;
  }
  
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int s=sum(m);
      System.out.println(s);
    }
  // Type your code here
	}
