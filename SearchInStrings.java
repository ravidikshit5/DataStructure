public class SearchInStrings {

  static boolean searchString(String str,char ch){
    if(str.length()==0){
      return false;
    }
    for(int i=0;i<str.length();i++)
    {
      
      char c = str.charAt(i);
      if(c==ch){
        return true;
      }
    }
    return false;
  }

  public static void main(String args[]){
      String str = "Ravi Dikshit";
      char ch = 'R';
      boolean bl = searchString(str, ch);
      System.out.println(bl);
  }
  
}
