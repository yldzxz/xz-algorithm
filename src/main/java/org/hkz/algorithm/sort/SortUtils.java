package org.hkz.algorithm.sort;

import java.util.Random;

public class SortUtils {
	/*
	 * �������
	 * */
	public static void print(int[] a){
		for (int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
		System.out.println();
	}
	/*
	 * ���������2����
	 * */
	public static void swap(int[] a, int i, int j) {
		int temp = 0;
		temp = a[j];
		a[j]  = a[i];
		a[i] = temp;
	}
	/*
	 * �����������Ϊn������
	 * */
	public static int[] getArrays(int n){
		int [] result = new int[n];
		for (int i = 0; i < result.length; i ++){
			Random rand = new Random();
			result[i] = rand.nextInt(20);
		}
		return result;
	} 
	
	public static void main(String[] args){
		int a[] = getArrays(10);
		print(a);
	}
}
