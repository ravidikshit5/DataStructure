public class findMaximumElementIn2D {

  static int maxIn2D(int arr[][]){
    int max = arr[0][0];
    for(int row=0;row<arr.length;row++){
      for(int col=0;col<arr[row].length;col++){
        if(arr[row][col]>max){
          max=arr[row][col];
        }
      }
    }
    return max;

  }
  public static void main(String args[]){
    int[][] arr = new int[][]{{1,2,3},{4,100,6},{7,8,200}};
    int in = maxIn2D(arr);
    System.out.println(in);


  }
  
}
