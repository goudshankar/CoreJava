package com.shs.basics.programes;

import java.util.Scanner;

public class LinearSearchExample {
		public static int linearSearch(int[] arr,int key) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==key) 
				return i;
			}
			return -1;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scn=new Scanner(System.in);
		int[] array= {20,40,38,65,41,21};
		System.out.println("Enter Key to Search:");
		int key=Integer.parseInt(args[0]);//scn.nextInt();
		System.out.println(key+":Key is found at Index:"+linearSearch(array,key));
	}

}
