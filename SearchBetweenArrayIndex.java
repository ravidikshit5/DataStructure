public class SearchBetweenArrayIndex {

  static boolean searchBetweenTwoIndex(int[] arr,int startIndex,int endIndex,int target){
    if(arr.length==0){
      return false;
    }
    for(int i=arr[startIndex];i<=arr[endIndex];i++){
        if(i==target){
          return true;
        }
    }
    return false;
  }
  public static void main(String args[]){
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int startIndex = 0;
    int endIndex = 3;
    int target = 8;
    boolean bl = searchBetweenTwoIndex(arr, startIndex, endIndex, target);
    System.out.println(bl);
  }
}
