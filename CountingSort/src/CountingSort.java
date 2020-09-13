
public class CountingSort {
	
	public void countfrequency(int[] arr) {
		
	}
	
	
	public int findMax(int[] arr) {
		int maxValue=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		return maxValue;
	}


	public void findfreq(int[] arr,int[] count) {
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			++count[arr[i]];
		}
	}


	public void cumulativeSum(int[] count) {
		for(int i=1;i<count.length;i++) {
			count[i]=count[i]+count[i-1];
		}
		
	}


	public void sort(int[] count, int[] b, int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			b[--count[a[i]]]=a[i];
		}
		
	}

}
