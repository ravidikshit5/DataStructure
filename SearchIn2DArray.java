public class SearchIn2DArray {
   static int[] searchIn2D(int a[][],int target){
    for(int row=0;row<a.length;row++){
      for(int col = 0;col<a[row].length;col++){
          if(a[row][col]==target){
            return new int[]{row,col};
          }
      }
    }

    return new int[]{-1,-1};

   }
  public static void main(String args[]){
    int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int target = 7;
    int p[] = searchIn2D(a, target);
    int n=p.length;
    for(int i=0;i<n;i++){
      System.out.print(p[i]+",");
    }
  }
  
}
