package Searching;
public class LinearSearchDemo{
    static void display(int[] arr,int length) {
	System.out.println("Elements are:");
	for(int i=0; i<length; i++) {
		System.out.println(arr[i]+" ");
	}
}
     static void swap(int[] arr, int x, int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
    static int linearSearch(int[] arr,int length,int key) {
		for(int i=0; i<length; i++) {
			if(key==arr[i]) {
				swap(arr,i,0);
				return i;
			}
		}
		return -1;
	}	
	public static void main(String[] args) {
		int[] arr= {8,9,4,7,6,3,10,5,14,2};
		int length=10;
		System.out.println("Index: "+ linearSearch(arr,length,5));
		display(arr,length);
	}
}
