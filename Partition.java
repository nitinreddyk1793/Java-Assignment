import java.io.*;
import java.util.*;
 
class Partition
{
    // A utility function that returns true if there is a
    // subset of list with sun equal to given sum
    static boolean isSubsetSum (List<Integer> list, int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
 
        // If last element is greater than sum, then ignore it
        if (list.get(n - 1) > sum)
            return isSubsetSum (list, n-1, sum);
 
        /* else, check if sum can be obtained by any of
           the following
        (a) including the last element
        (b) excluding the last element
        */
        return isSubsetSum (list, n-1, sum) ||
               isSubsetSum (list, n-1, sum-list.get(n- 1));
    }
 
    // Returns true if list can be partitioned in two
    // subsets of equal sum, otherwise false
    static boolean separate (List<Integer> list, int n)
    {
        // Calculate sum of the elements in arraylist
        int sum = 0;
        for (int i=0;i<n;i++)
            sum +=list.get(i);
 
        // If sum is odd, there cannot be two subsets
        // with equal sum
        if (sum%2 != 0)
            return false;
 
        // Find if there is subset with sum equal to half
        // of total sum
        return isSubsetSum (list, n, sum/2);
    }
 
    /*Driver function to check for above function*/
    public static void main (String[] args)
    {
List<Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
        int n = list.size();
        if (separate(list, n) == true)
            System.out.println("Can be divided into two "+
                                "subsets of equal sum");
        else
            System.out.println("Can not be divided into " +
                                "two subsets of equal sum");
    }
}
