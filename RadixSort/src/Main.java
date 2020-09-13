import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) {
		int arr[] = {432,8,530,90,88,231,11,45,677,199}; 
        int n = arr.length;
        
        System.out.println("original array is"+Arrays.toString(arr));
        
        radixsort(arr, n); 
        System.out.println("sorted array is"+Arrays.toString(arr));
       // print(arr, n); 
	}
	
	public static void radixsort(int[] arr,int n) {
		int max=getMax(arr);
		
		for(int pos=1;max/pos>0;pos*=10) {
			int[] count=new int[10];
	        Arrays.fill(count,0);
			countSort(arr,n,pos,count);
		}
	}

	private static int getMax(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void countSort(int[] arr,int n,int pos,int[] count) {
		int[] b=new int[10];
		
		//calculate the frequeyncy
		for(int i=0;i<n;i++) {
			++count[(arr[i]/pos)%10];
		}
		
		//System.out.println("frquency is"+Arrays.toString(count));
		
		//claculate the sum
		for(int i=1;i<count.length;i++) {
			count[i]=count[i]+count[i-1];
		}
		
		//System.out.println("sum is"+Arrays.toString(count));
		Arrays.fill(b,0);
		for(int i=n-1;i>=0;i--) {
			//System.out.println(arr[i]);
			b[--count[(arr[i]/pos)%10]]=arr[i];
		}
		
		//copying from b to arr array
		for(int i=0;i<arr.length;i++) {
			arr[i]=b[i];
		}
	}
	
}
