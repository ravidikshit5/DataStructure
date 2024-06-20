public class TrueFalseLinearSearch {

  static boolean linearSearch(int[] arr,int target){
    if(arr.length==0){
      return false;
    }
    for(int element:arr){
      if(element==target){
          return true;
      }
    }
    return false;
  }

  public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7,89,};
    int target = 6;
    boolean ans = linearSearch(arr, target);
    System.out.println(ans);
  }
  
}
