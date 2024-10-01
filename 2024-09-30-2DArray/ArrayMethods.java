public class ArrayMethods{
//Sophia Young sophiay30@nycstudents.net
//Xinlin Yin xinliny3@nycstudents.net

public static void main(String[] args){
  int[][] arr0 = new int[][] {{89, 1, 73}, {710, 35, 5, 2}, {0}, {46, 209}}; //jagged
  int[][] arr1 = new int[][] {{4, 76, 208, 14}, {40, 951, 20, 480}}; //rectangle
  int[][] arr2 = new int[][] {{18, 34, 19, 28}, {10, 7, 46, 39}, {38, 16, 3, 91}, {33, 9, 47, 4}}; //square
  int[][] arr3 = new int[][] {{2, 8, 3, 4}, {1, 0, 5, 9, 5}, {6, 2, 9}}; //jagged

//System.out.println(arr0[0].length);

  System.out.println("Test if arrToStrings can make strings of 2D arrays");
  System.out.println("Expected for arr0:  [[89, 1, 73], [710, 35, 5, 2], [0], [46, 209]]");
  System.out.println("Observed for arr0:  " + arrToString(arr0));
  System.out.println("Expected for arr1:  [[4, 76, 208, 14], [40, 951, 20, 480]]");
  System.out.println("Observed for arr1:  " + arrToString(arr1));
  System.out.println("Expected for arr2:  [[18, 34, 19, 28], [10, 7, 46, 39], [38, 16, 3, 91], [33, 9, 47, 4]]");
  System.out.println("Observed for arr2:  " + arrToString(arr2));
  System.out.println("Expected for arr3:  [[2, 8, 3, 4], [1, 0, 5, 9, 5], [6, 2, 9]]");
  System.out.println("Observed for arr3:  " + arrToString(arr3));

  System.out.println("\nTest if arr2DSum can return correct sum of values in array");
  System.out.println("Expected for arr0: 1170");
  System.out.println("Observed for arr0: " + arr2DSum(arr0) + "  equal? " + (1170 == arr2DSum(arr0)));
  System.out.println("Expected for arr1: 1793");
  System.out.println("Observed for arr1: " + arr2DSum(arr1) + "  equal? " + (1793 == arr2DSum(arr1)));
  System.out.println("Expected for arr2: 442");
  System.out.println("Observed for arr2: " + arr2DSum(arr2) + "  equal? " + (442 == arr2DSum(arr2)));
  System.out.println("Expected for arr3: 54");
  System.out.println("Observed for arr3: " + arr2DSum(arr3) + "  equal? " + (54 == arr2DSum(arr3)));

  System.out.println("\n Test if swapRC can return correct array");
  System.out.println("Expected for arr1: [[4, 40], [76, 951], [208, 20], [14, 480]]");
  System.out.println("Observed for arr1: " + arrToString(swapRC(arr1)));
  System.out.println("Expected for arr2: [[18, 10, 38 ,33], [34, 7, 16, 9], [19, 46, 3, 47], [28, 39, 91, 4]]");
  System.out.println("Observed for arr2: " + arrToString(swapRC(arr2)));
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

public static String arrToString(int[][]ary){
  String result = "[";
  for(int j = 0; j < ary.length; j++)
  {
    result = result + arrToString(ary[j]);
    if(j != ary.length - 1) result = result + ", ";
  }
  return result + "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  int sum = 0;
  for(int i = 0; i < nums.length; i++)
  {
    for (int j = 0; j < nums[i].length; j++)
    {
      sum = sum + nums[i][j];
    }
  }
  return sum;
}

//Rotate an array by returning a new array with the rows and columns swapped.
public static int[][] swapRC(int[][]nums){
  int[][] ans = new int[nums[0].length][nums.length];
  for(int i = 0; i < nums[0].length; i++)//i is term in og array
  {
    for(int j = 0; j < nums.length; j++)//j is the array in the og 2d array
    {
      ans[i][j] = nums[j][i];
    }
  }
 return ans;
}

//10-1
//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for(int i = 0; i < val.length; i++)
  {
    for(int j = 0; j < vals[i].length; j++)
    {
      if
    }
  }

}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums){
  return null;//placeholder so it compiles
}



}
