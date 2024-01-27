public class Solution {
	public static void merge(int[] arr,int s, int e){
		int mid=(s+e)/2;
		int l1=mid-s+1;
		int l2=e-mid;

		int[] newArr1=new int[l1];
		int[] newArr2=new int[l2];

		int k=s;
		for(int i=0;i<l1;i++){
			newArr1[i]=arr[k++];
		}
		k=mid+1;
		for(int i=0;i<l2;i++){
			newArr2[i]=arr[k++];
		}

		k=s;
		int in1=0;
		int in2=0;
		while(in1<l1 && in2<l2){
			if(newArr1[in1]<newArr2[in2]){
				arr[k++]=newArr1[in1++];
			}else{
				arr[k++]=newArr2[in2++];
			}
		}

		while(in1<l1){
			arr[k++]=newArr1[in1++];
		}

		while(in2<l2){
			arr[k++]=newArr2[in2++];
		}


	}

	public static void solveMS(int[] arr, int n,int s, int e){
		if(s>=e){
			return ;
		}

		int mid=(s+e)/2;
		solveMS(arr,n,s,mid);
		solveMS(arr,n,mid+1,e);

		merge(arr,s,e);

	}
	public static void mergeSort(int[] arr, int n) {
		solveMS(arr,n,0,n-1);
	}
}
