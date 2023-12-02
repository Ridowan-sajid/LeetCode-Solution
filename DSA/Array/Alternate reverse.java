public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8};
        for(int i=0;i<arr.length;i=i+2){
            if(i<(arr.length-1)){
                int l=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=l;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
}
}
