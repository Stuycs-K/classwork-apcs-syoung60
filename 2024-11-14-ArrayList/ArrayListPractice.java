import java.util.ArrayList;

public class ArrayListPractice {
  public static void main(String args[]) {
    System.out.println("  EMPTY TEST");
    for (int count = 0; count < 20; count++){
      ArrayList<String> testCase = createRandomArray(10);
      System.out.println(testCase);
      replaceEmpty(testCase);
      System.out.println("" + testCase + "\n");
    }
    /*ArrayList<String> longTest = createRandomArray(200000);
        System.out.println(longTest);
        replaceEmpty(longTest);
        System.out.println(longTest);*/
    
    System.out.println(" \n\n\n REVERSED TEST");
     for (int count = 0; count < 20; count++){
      ArrayList<String> testCase2 = createRandomArray(10);
      System.out.println(testCase2);
      System.out.println(makeReversedList(testCase2) + "\n");}

    /*ArrayList<String> longTest = createRandomArray(200000);
    //System.out.println(longTest);
    System.out.println(makeReversedList(longTest));*/

    System.out.println(" \n\n\n MIX TEST");
    for (int count = 0; count < 10; count++){
      ArrayList<String> testCaseA = createRandomArray(5);
      System.out.println(testCaseA);
      ArrayList<String> testCaseB = createRandomArray(5);
      System.out.println(testCaseB);
      System.out.println(mixLists(testCaseA, testCaseB) + "\n");}
     for (int count = 0; count < 10; count++){
      ArrayList<String> testCaseA = createRandomArray(8);
      System.out.println(testCaseA);
      ArrayList<String> testCaseB = createRandomArray(5);
      System.out.println(testCaseB);
      System.out.println(mixLists(testCaseA, testCaseB) + "\n");}
    /*ArrayList<String> longTestA = createRandomArray(100000);
    ArrayList<String> longTestB = createRandomArray(100000);
    //System.out.println(longTest);
    System.out.println(mixLists(longTestA, longTestB));*/
    /*ArrayList<String> longTestA = createRandomArray(200000);
    ArrayList<String> longTestB = createRandomArray(200000);
    //System.out.println(longTest);
    System.out.println(mixLists(longTestA, longTestB));*/


    
    
  }


  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> list = new ArrayList<String>(size);
    for (int i = 0; i < size; i++) {
      int rand = (int)(Math.random() * 11);
      //list.add("banana");
      list.add("" + rand);
      if (rand == 0) {
        list.set(i, "");
      }
    }
    return list;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int count = 0; count < original.size(); count++){
      if (original.get(count).equals("")){
        original.set(count, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> ans = new ArrayList<String>();
    for(int i = 0; i < original.size(); i++){
        ans.add(original.get(original.size() - i - 1));
    }
    return ans;
  //return a new ArrayList that is in the reversed order of the original.
  } 

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> ans = new ArrayList<String>();
    int i = 0;
    while(i < a.size() && i < b.size()){
      ans.add(a.get(i));
      ans.add(b.get(i));
      i++;
    }
    while(a.size() > i){
      ans.add(a.get(i));
      i++;
    }
    while(b.size() > i){
      ans.add(b.get(i));
      i++;
    }
    return ans;
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  } 
}