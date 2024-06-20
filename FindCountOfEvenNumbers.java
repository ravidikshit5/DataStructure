public class FindCountOfEvenNumbers {

  static int findCountOfEven(int arr[]){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        count++;
      }
    }
    return count;
  }
  public static void main(String args[]){
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int printCount = findCountOfEven(arr);
    System.out.println(printCount);
  }
  
}
