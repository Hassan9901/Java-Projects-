package testing;

import java.util.Arrays;

public class JunitTesting {
	// This simple test case just test the Square of Integer Number
      public int square(int sq) {
    	  return sq*sq;
      }
      // This Test case Count the alphbates form given string
      public int count (String word) {
    	  int count =0;
    	 for(int i= 0 ; i<word.length();i++) {
    		 if(word.charAt(i)=='a'||word.charAt(i)=='A') {
    			 count++;
    		 }
    	 }
    	 return count;
      }
      // This Test case check the sum of a triangle 
      
      public static void printTriangle(int[] A)
      {
          if (A.length < 1)
              return;
    
          // Creating new array which contains the
          // Sum of consecutive elements in
          // the array passes as parameter.
          int[] temp = new int[A.length - 1];
          for (int i = 0; i < A.length - 1; i++)
          {
              int x = A[i] + A[i + 1];
              temp[i] = x;
          }
          printTriangle(temp);
          System.out.println(Arrays.toString(A));
      }
      // This Function tell the type of triangle
      
      public String getype(int a,int b,int c) {
    	  if (a==b && a==c)
    		  return "Equiltearl";
    	  else if (a!=b && b!=c && a!=c)
    		  return "Scalene";
    	  else return "Isloated";
      }
}
