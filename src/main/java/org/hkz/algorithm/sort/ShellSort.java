package org.hkz.algorithm.sort;

public class ShellSort {
	
	public static void main(String[] args) {
		int a[] = SortUtils.getArrays(10);
		//int a[] = { 9 ,18 ,7, 10, 1 ,10, 8, 9, 7, 18 };
		System.out.print("排序前的数据 : ");
		SortUtils.print(a);
		System.out.print("排序后的数据 : ");
		shellSort1(a);
		SortUtils.print(a);
	}

	private static void shellSort1(int[] a) {
		int b[] = {5,3,1};
		for (int i = 0; i < b.length; i++){
			
			for (int j = b[i]; j <  a.length;j+=b[i] ){
				int sta = j;
				int index = a[j];
				while(sta-b[i] >=0 &&index < a[sta -b[i]]  ){
					a[sta] = a[sta - b[i]];
					sta = sta -b[i];
				}
				a[sta] = index;
			}
			
		}
		
		
	}

}
