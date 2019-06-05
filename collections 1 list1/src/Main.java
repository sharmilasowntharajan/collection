import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double a[]=new double[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		List<Double> b=new ArrayList<Double>();
		for(int i=0;i<n;i++)
		{
	     b.add(a[i]);
		}
		double sum=0;
		for(Double i:b)
		{
			sum=sum+i;
		}
		double x=sum/n;
		System.out.println((int)sum);
		System.out.printf("%.1f",x);
	}

}
