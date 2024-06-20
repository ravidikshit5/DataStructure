public class SearchInRange {

  static boolean searchInRange(int start,int end,int target){
    if(start==end){
      return false;
    }

    for(int i=start;i<=end;i++){
      if(i==target){
        return true;
      }
    }
    return false;

  }
  public static void main(String args[]){

    int start =80; 
    int end = 80;
    int target = 80;
    boolean bl = searchInRange(start, end, target);
    System.out.println(bl);

  }
  
}
