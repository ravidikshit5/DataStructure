public class findMinimumInAnArray {
  static int minimumInArray(int[] arr){
    int min = arr[0];
    for(int i=1;i<=arr.length;i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }
 public static void main(String args[]){
    int[] arr = {23,24,12,10,5,2,1};
    int in = minimumInArray(arr);
    System.out.println(in);
 } 
}
