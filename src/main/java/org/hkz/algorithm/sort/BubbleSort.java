package org.hkz.algorithm.sort;


public class BubbleSort {

	public static void main(String[] args) {
//		int [] a = {2,3,3,4,23,22,1};
		
//		a = bubbleSort3(a);
//		SortUtils.print(a);  		����
		int[] b = SortUtils.getArrays(10); 
		System.out.print("����ǰ������ : ");
		SortUtils.print(b);
		System.out.print("���������� : ");
		b = bubbleSort3(b);
		SortUtils.print(b);
	}
	
	public static int[]  bubbleSort1(int a[]){
		for (int i = 0; i < a.length; i++){		
			for (int j = 1; j < a.length - i ; j++){
				if (a[j] < a[j-1]){
					SortUtils.swap(a,j-1,j);
				}
			}
		}
		return a;
	}
	
	
	/**
	 * �Ľ���ð����������һ��flag�����һ������û�з���������˵�������Ѿ����
	 * 
	 * */
	public static int[]  bubbleSort2(int a[]){
		boolean flag = false;
		for (int i = 0; i < a.length; i++){
			flag = false;
			for (int j = 1; j < a.length - i ; j++){
				if (a[j] < a[j-1]){
					flag = true;
					SortUtils.swap(a,j-1,j);
				}
			}
			if (!flag){
				break;
			}
		}
		return a;
	}
	
	/**
	 * ð�������Ż�������һ����־λ��ȷ��ÿ�������λ��
	 * */
	public static int[]  bubbleSort3(int a[]){
		int len= a.length,lenj = a.length;
		boolean flag = false;
		for (int i = 0; i < a.length; i++){
			flag = false;
			for (int j = 1; j < len ; j++){
				if (a[j] < a[j-1]){
					flag = true;
					SortUtils.swap(a,j-1,j);		
				}
			}
			len = lenj;
			if (!flag){
				break;
			}
		}
		return a;
	}
	


}
