public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8};
        int first=0;
        int last=arr.length-1;
        for(int i=0;i<arr.length;i=i+2){
                int l=arr[first];
                arr[first]=arr[last];
                arr[last]=l;
                first++;
                last--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
