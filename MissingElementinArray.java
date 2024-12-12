package homeAssignment.week3_2;

import java.util.Arrays;
import java.util.LinkedList;

public class MissingElementinArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,10,6,8};
		Arrays.sort(arr);
		System.out.println("Missing:");
		LinkedList<Object> ll=new LinkedList<Object>();
		for(Object x:arr)
		ll.add(x);
		for(int i=1;i<=arr[arr.length-1];i++) {
			if (ll.contains(i)==false) {
				System.out.print(i+" ");
			}
		}
		
}
}


