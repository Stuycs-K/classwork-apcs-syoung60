public class MyArrays{
public static void main(String[] args){
  int[] ary1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
  int[] ary2 = {21, 32, 43, 54, 65, 76, 87, 98};
  int[] ary3 = {258, 51, 7, 729, 63, 3, 13, 97, 186, 815, 48, 173, 130, 402, 183, 245};
  int[] copy1 = returnCopy(ary1)
  int[] copy1 = returnCopy(ary2)
  int[] copy1 = returnCopy(ary3)

  System.out.println("Comparing Array 1: " + arrayToString(ary1) + ", to its copy: " arrayToString(copy1));
  System.out.println("Do the addresses match? " + (ary1 == copy1));

  System.out.println("Comparing Array 2: " + arrayToString(ary2) + ", to its copy: " arrayToString(copy2));
  System.out.println("Do the addresses match? " + (ary2 == copy3));

  System.out.println("Comparing Array 3: " + arrayToString(ary3) + ", to its copy: " arrayToString(copy3));
  System.out.println("Do the addresses match? " + (ary3 == copy3));


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
