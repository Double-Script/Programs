public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {23,4,5,18,25};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
        int max=arr[0];
        int max2=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>max2){
                max=arr[i];
                max2=arr[i];
            }
        }
        System.out.println("this is max value: "+ max);
        System.out.println("second largest "+ max2);
    }
}
