import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,5,3};
        int index = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[index-1]!=arr[i]){
                arr[index++]= arr[i];

            }
        }
        System.out.println(index);

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[i]==arr[j]){
//                    arr[i]=0;
//                }
//            }
//        }



//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]!=0){
//                int temp= arr[i];
//                arr[i]=arr[count];
//                arr[count]=temp;
//                count++;
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
}
