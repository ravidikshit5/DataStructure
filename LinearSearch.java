public class LinearSearch {

  static int linearSearch(int[] arr,int target){
    if(arr.length==0){
      return -1;
    }

    for(int i=0;i<arr.length;i++){
      int element = arr[i];
      if(element==target){
        return i;
      }
    }
    return 0;
  }
  public static void main(String args[]){
    int[] arr = {1,2,3,4,5,6};
    int target = 5;
    System.out.println(linearSearch(arr, target));
  }
}
