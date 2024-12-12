package homeAssignment.week3_2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=a[0]) {
			System.out.println(a[n-2]);
			break;
			}
		}

	}

}
