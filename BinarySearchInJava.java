package com.demo;

public class Test {
	public static int binarySearch(int[]arr, int key) {
		int l = 0;
		int r = arr.length-1;
		while(l<r) {
			int m = (l+r)/2;
			if(arr[m] == key) {
				return m;
			}
			else if(key > arr [m]) {
				l = m +1;
			}
			else {
				r = m-1;
			}
		}
		return -1;
	}

	public static void main (String [] args) {
		int arr[] = {1, 2, 3, 4,5,6,8, 10, 40 };
		int key = 10;
		System.out.println(binarySearch(arr,key));
		
	}
	}

	


