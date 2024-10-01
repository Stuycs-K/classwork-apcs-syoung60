public class ArrayMethods{
//Sophia Young sophiay30@nycstudents.net
//Xinlin Yin xinliny3@nycstudents.net

public static void main(String[] args){
  int[][] arr0 = new int[][] {{89, 1, 73}, {710, 35, 5, 2}, {0}, {46, 209}}; //jagged
  int[][] arr1 = new int[][] {{4, 76, 208, 14}, {40, 951, 20, 480}}; //rectangle
  int[][] arr2 = new int[][] {{18, 34, 19, 28}, {10, 7, 46, 39}, {38, 16, 3, 91}, {33, 9, 47, 4}}; //square
  int[][] arr3 = new int[][] {{2, 8, 3, 4}, {1, 0, 5, 9, 5}, {6, 2, 9}}; //jagged

  System.out.println("Test strings of 2D arrays");
  System.out.println("Expected:  ")

}


public static String arrToString(int[] nums){
  String ans = "[";
  for(int i = 0; i < nums.length; i++)
  {
    ans = ans + nums[i];
    if(i != nums.length - 1) ans = ans + ", ";
  }
  return ans + "]";
}


//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  return "";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}

}
