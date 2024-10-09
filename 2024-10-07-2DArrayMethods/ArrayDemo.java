import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] arr0 = new int[][] {{89, 1, 73}, {710, 35, 5, 2}, {0}, {46, 209}}; //jagged
    int[][] arr1 = new int[][] {{4, 76, 208, 14}, {40, 951, 20, 480}}; //rectangle
    int[][] arr2 = new int[][] {{18, 34, 19, 28}, {10, 7, 46, 39}, {38, 16, 3, 91}, {33, 9, 47, 4}}; //square
    int[][] arr3 = new int[][] {{2, 8, 3, 4}, {1, 0, 5, 9, 5}, {6, 2, 9}}; //jagged
    int[][] arr4 = new int[][] {{0, -190, 3, 60, 0}, {-41, 8, 0, 0, -39, 10}, {-4, 0, 626, 55, 0, 0, -20, 0, 93}};//8 zeros
    int[][] arr0neg = new int[][] {{89, 1, 73}, {710, 35, -5, 2}, {0}, {46, 209}}; //jagged
    int[][] arr1neg = new int[][] {{4, 76, -208, 14}, {40, -951, -20, 480}}; //rectangle
    int[][] arr2neg = new int[][] {{18, -34, 19, 28}, {10, 7, 46, 39}, {38, -16, 3, -91}, {33, 9, -47, -4}}; //square
    int[][] arr3neg = new int[][] {{-2, 8, -3, 4}, {1, 0, 5, -9, 5}, {6, 2, -9}}; //jagged
    int[][] arr0copy = copy(arr0);
    int[][] arr1copy = copy(arr1);
    int[][] arr2negcopy = copy(arr2neg);
    int[][] arr3negcopy = copy(arr3neg);

    System.out.println("Test cases for arrToString");
    System.out.println("Compare Arrays.toString to my arrToString: arr0");
    System.out.println(Arrays.deepToString(arr0));
    System.out.println(arrToString(arr0) + "     Are they the same?  " + ((Arrays.deepToString(arr0)).equals(arrToString(arr0))));
    System.out.println("Compare Arrays.toString to my arrToString: arr2");
    System.out.println(Arrays.deepToString(arr2));
    System.out.println(arrToString(arr2) + "     Are they the same?  " + ((Arrays.deepToString(arr2)).equals(arrToString(arr2))));
    System.out.println("Compare Arrays.toString to my arrToString arr3neg");
    System.out.println(Arrays.deepToString(arr3neg));
    System.out.println(arrToString(arr3neg) + "     Are they the same?  " + ((Arrays.deepToString(arr3neg)).equals(arrToString(arr3neg))));

    System.out.println("\nTest cases for countZeros2D");
    System.out.println("Expects 1 : " + countZeros2D(arr0) + "   " + (1 == countZeros2D(arr0)));
    System.out.println("Expects 0 : " + countZeros2D(arr1) + "   " + (0 == countZeros2D(arr1)));
    System.out.println("Expects 0 : " + countZeros2D(arr2) + "   " + (0 == countZeros2D(arr2)));
    System.out.println("Expects 1 : " + countZeros2D(arr3) + "   " + (1 == countZeros2D(arr3)));
    System.out.println("Expects 8 : " + countZeros2D(arr4) + "   " + (8 == countZeros2D(arr4)));

    System.out.println("\nTest cases for htmlTable");
    System.out.println("arr0 Expected: <table><tr><td>89</td><td>1</td><td>73</td></tr>" +    
                                             "<tr><td>710</td><td>35</td><td>5</td><td>2</td></tr>" +  
                                             "<tr><td>0</td></tr>" +
                                             "<tr><td>46</td><td>209</td></tr></table>");
    System.out.println("arr0 Observed: " + htmlTable(arr0));
    System.out.println("Do they match?  " +
                        ("<table><tr><td>89</td><td>1</td><td>73</td></tr><tr><td>710</td><td>35</td><td>5</td><td>2</td></tr><tr><td>0</td></tr><tr><td>46</td><td>209</td></tr></table>").equals(htmlTable(arr0)));
    System.out.println("arr1 Expected: <table><tr><td>4</td><td>76</td><td>208</td><td>14</td></tr>" +    
                                             "<tr><td>40</td><td>951</td><td>20</td><td>480</td></tr></table>");
    System.out.println("arr1 Observed: " + htmlTable(arr1));
    System.out.println("Do they match?  " + ("<table><tr><td>4</td><td>76</td><td>208</td><td>14</td></tr><tr><td>40</td><td>951</td><td>20</td><td>480</td></tr></table>").equals(htmlTable(arr1)));

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String ans = "[";
    for(int i = 0; i < ary.length; i++)
    {
      ans = ans + ary[i];
      if(i != ary.length - 1) ans = ans + ", ";
    }
    return ans + "]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for(int j = 0; j < ary.length; j++)
    {
      result = result + arrToString(ary[j]);
      if(j != ary.length - 1) result = result + ", ";
    }
    return result + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int zeros = 0;
    for(int i = 0; i < nums.length; i++)
    {
      for(int j = 0; j < nums[i].length; j++)
      {
        if (nums[i][j] == 0) zeros++;
      }
    }
    return zeros;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
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

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for(int i = 0; i < vals.length; i++)
    {
      for(int j = 0; j < vals[i].length; j++)
      {
        if(vals[i][j] < 0)
        {
          vals[i][j] = 0;
          if(j == i) vals[i][j] = 1;
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] result = new int[nums.length][];
    for (int i = 0; i < nums.length; i++)
    {
      result[i] = returnCopy(nums[i]);
    }
    return result;
  }

  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for(int i = 0; i < ary.length; i++)
    {
      ans[i] = ary[i];
    }
    return ans;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
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

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for(int i = 0; i < nums.length; i++)
    {
      result = result + "<tr>";
      for (int j = 0; j < nums[i].length; j++)
      {
        result = result + "<td>" + nums[i][j] + "</td>";
      }
      result = result + "</tr>";
    }
    return result + "</table>";
  }
}
