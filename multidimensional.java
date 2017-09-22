class MultiDimensionArray {
    // This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //... 
        return value;
    }
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
public static Long sum(MultiDimensionArray mArray, int[] lengthOfDeminsion) { 
int n = lengthOfDimension.Length;
int[] t = new int[n];
int a = n-2;
Long sum = 0;
do
{
    for (t[n-1] = 0; t[n-1] < lengthOfDimension[n-1]; t[n-1]++)
    {
        sum += getValue(t);
    }
    while (a >= 0 && ++[a] == lengthOfDimension[a])
    {
        t[a--] = 0;
    }
    if (a >= 0) 
		a = n-2;
}
while (a >= 0);
	}
    return sum;
    }
	//Time complexity=O(K*M)
	//Space complexity=O(1)
