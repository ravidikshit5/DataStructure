public class findTheEvenNumberPresent {
 
static int noOfEvenDigits(int arr[]){
  int count2=0;
  for(int i=0;i<arr.length;i++){
    int n = arr[i];
    int count=0;
    
    while (n!=0) {
      n = n/10;
      count++;
    }
    
    if(count%2==0){
      count2++;
    }
   
  }
  
  return count2;
 
}

  public static void main(String args[]){
    int[] arr = {1,2,3,4,5,6,7,8,9,10,2345,23,34,45,67,68,69,70,71,123,123456};
    int in1 = noOfEvenDigits(arr);
    System.out.println(in1);
  }
  
}
