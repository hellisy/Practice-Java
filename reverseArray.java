import java.util.Arrays;
// Question 5 JAVA CST8116 Assignment #5
// Reverse of values in an Array program.


public class reverseArray { 
  
    /* function that reverses array and stores it  
       in another array*/
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; //empty array set as the length of the original array
        int j = n; //we set the j value as the total lenth of the array if 5, j equal 5 to reverse the for loop
        for (int i = 0; i < n; i++) { //goes through the elements in the array
            b[j - 1] = a[i]; //filling up the new array with the values specified by the j value, j is going in reverse to the array.
            j = j - 1; 
        }
        System.out.printf("Original array is: %s %n",Arrays.toString(a)); //output the original array
        System.out.printf("Reversed array is: %s", Arrays.toString(b)); //output the reveresed array

    } 
  
    public static void main(String[] args) 
    { 
        int [] arr = {1, 2, 3, 4, 5}; 
        reverse(arr, arr.length); //using the function to reverse the array "arr"
    } 
} 