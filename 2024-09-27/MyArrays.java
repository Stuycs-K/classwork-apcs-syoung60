public class MyArrays{
public static void main(String[] args){

}
public static String arrayToString(int[] nums){
  String ans = "[";
  for(int i = 0; i < nums.length; i++)
  {
    ans = ans + nums[i];
    if(i != nums.length - 1) ans = ans + ", ";
  }
  return ans + "]";
}

//Write a function that returns a new array with the same values as the parameter ary.
//BEFORE write code: Discuss with your neighbors how do you test if the arrays match, 
//and how do you test that they are not the same array?
public static int[] returnCopy(int[]ary){
  int[] ans = new int[ary.length]
  for(int i = 0; i < ary.length; i++)
  {
    ans[i] = ary[i];
  }
  return ans;

}



//Write a function that returns a new array, that contains all of the values of ary1 followed by all of the values of ary2. 
//The order of the values should remain the same.

public static int[] concatArray(int[]ary1,int[]ary2){
  int[] ans = new int[ary1.length + ary2.length];
  int i = 0;
  for(; i < ary1.length; i++)
  {
    ans[i] = ary1[i];
  }
  for(i = ary1.length; i < ary1.length + ary2.length; i++)
  {
    ans[i + ary1.length] = ary2[i];
  }
  return ans;
}


}
