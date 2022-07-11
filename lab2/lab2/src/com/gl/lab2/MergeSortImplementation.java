package com.gl.lab2;

public class MergeSortImplementation {
	

	public void sort(int arr[],int lb, int ub) {
		if(lb<ub) {
			int mid=(lb+ub)/2;
			sort(arr,lb,mid);
			sort(arr,mid+1,ub);
			merge(arr,lb,mid,ub);
		}
	}

	public void merge(int[] array, int l, int m, int r) {
		int s1 = m-l+1;
		int s2 = r-m;
		int left[] =new int[s1];
		int right[] = new int[s2];
		
		for( int i=0;i<s1;i++) {
			left[i]=array[l+i];
		}
		
		for( int i=0;i<s2;i++) {
			right[i]=array[m+1+i];
		}
		int i,j,k;
		i=0;j=0;k=l;
		while(i<s1&&j<s2) {
			if(left[i]>=right[j]) {
				array[k]=left[i];
				i++;
			}
			else {
				array[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<s1) {
			array[k]=left[i];
			i++;
			k++;
		}
		while(j<s2) {
			array[k]=right[j];
			j++;
			k++;
		}
	}

}
