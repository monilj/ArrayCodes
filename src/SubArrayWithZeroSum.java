public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int [] num ={ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printAllSubArrayWithZeroSum(num);
    }

    public static void printAllSubArrayWithZeroSum(int[] num) {
        for (int i = 0; i < num.length; i++)
        {
            int sum = 0;
            // consider all sub-arrays ending at j
            for (int j = i; j < num.length; j++)
            {
                // sum of elements so far
                sum += num[j];

                // if sum is seen before, we have found a subarray with 0 sum
                if (sum == 0) {
                    System.out.println("Subarray [" + i + " to " + j + "]");
                }
            }
        }
    }
}
