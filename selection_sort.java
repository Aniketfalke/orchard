package com.selflearning;

import java.util.ArrayList;
import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an arraylist");
		int size=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(size);
        System.out.format("Enter %d element in arraylist\n",size);
        for(int i=0;i<size;i++) {
        	int num=sc.nextInt();
        	arr.add(i,num);
        }
        System.out.println("Before sorting");
        System.out.println(arr);
        selctionSort(arr,size);
        System.out.println("after sorting");
        System.out.println(arr);
	}

	private static void selctionSort(ArrayList<Integer> arr, int size) {
        int min;
        int temp;
		for(int i=0;i<size;i++) {		
        	   min=i;
        	   for(int j=i+1;j<size;j++) {
        		 if(arr.get(j)<arr.get(min)) {  
        			 min=j;
        		 }
        	   }
        	   temp=arr.get(min);
        	   arr.set(min,arr.get(i));
        	   arr.set(i,temp);
           }
		
	}

}
