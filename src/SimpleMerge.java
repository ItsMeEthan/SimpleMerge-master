/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
    public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] m = new int[arr1.length + arr2.length];
        int x1 = 0;
        int x2 = 0;
        for (int mm = 0; mm < m.length; mm++) {
            if (x1 >= arr1.length || x2 >= arr2.length) {
                if (x >= arr1.length) {
                    m[mm] = arr2[x2];
                    y++;
                } else {
                    m[mm] = arr1[x1];
                    x++;
                }
            } else {
                if (arr1[x1] < arr2[x2]) {
                    if (x1 < arr1.length) {
                        m[mm] = arr1[x1];
                        x++;
                    }
                } else {
                    if (y < arr2.length) {
                        m[mm] = arr2[x2];
                        x2++;
                    }
                }

            }
        }
        return m;
    }
}
