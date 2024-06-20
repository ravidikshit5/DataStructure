public class RemoveDuplicates {
  static int removeDuplicates(int[] arr){
    int rd=0;
    for(int i=1;i<arr.length;i++){
      if(arr[rd]!=arr[i]){
        rd++;
        arr[rd]=arr[i];
      }
      }
    return rd+1;
  }
  
  public static void main(String args[]){
  int[] arr = {1,1,2,3,3,4,5,6,6,6,7,8,9};
  
System.out.println("Arrray with duplication");
for(int i=0;i<arr.length;i++){
  System.out.print(arr[i]+" ");
}

 int rd = removeDuplicates(arr);
 System.out.println("Array after removal of duplicates"+rd);
 for(int i=0;i<rd;i++){
  System.out.print(arr[i]+" ");
 }
 

}
 
}
