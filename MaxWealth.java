public class MaxWealth {
  static int maxWealth(int[][] arr) {
    int max=0;int sum=0;
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        
sum = sum + arr[row][col];
        max =sum;
        if(max>sum){
          return max;
        }
        
      }
    }
    return max;
}

  public static void main(String args[]) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{10,20,30}};
    int in1 = maxWealth(arr);
    System.out.println(in1);

  }
}
