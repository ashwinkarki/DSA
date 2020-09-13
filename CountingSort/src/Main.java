import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		int a[]= {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		int n=a.length;
		System.out.println("original array is"+Arrays.toString(a));
		//first find max value in arr
		int max=new CountingSort().findMax(a);
		System.out.println("Max in array is"+max);
		
		//count frequency 
		int[] count=new int[max+1];
		Arrays.fill(count,0);
		//System.out.println(Arrays.toString(count));
		new CountingSort().findfreq(a,count);
		
		System.out.println("frequency is"+Arrays.toString(count));
		
		//find the cumulative sum
		new CountingSort().cumulativeSum(count);
		
		//count array after cumulative sum is
		System.out.println("cumulative sum is"+Arrays.toString(count));
		
		int[] b=new int[a.length];
		new CountingSort().sort(count,b,a);
		
		System.out.println("array sorted is"+Arrays.toString(b));
	}

}
