package org.hkz.alogrithm.other;


/*
 * 算法：查找第k小的数
 * 算法复杂度：O(n)
 * */
public class Ksort {

	public static void main(String[] args){
		int[] a = {2,3,9,8,7,6,1,4,5,10};
		int k = 10;
		int num = getKminNum(a,k);
		System.out.println(num);
	}
	public static int  getKminNum(int[] a, int k){	
		return getkNum(a, 0, a.length - 1, k-1);
	}
	
	public static int getkNum(int[] a, int i, int j, int k) {
		int index = a[(i + j)/2];
		int start = i , end = j,temp = 0;
		while(start < end){
			while (index < a[end]){
				end--;
			}
			while (index > a[start]){
				start++;
			}
			if (start < end ){
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		a[start] = index;
		if (start == k) return  a[k];
		else if (k < start ) return getkNum(a, i,start - 1 ,k); 
		else return getkNum(a, start + 1 ,j, k );
		
	}
	
}
