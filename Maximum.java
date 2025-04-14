public class Maximum {
    public static void main(String[] args) {
        int[] arr = {23,4,5,18,25};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("this is max value: "+ max);
    }
}
