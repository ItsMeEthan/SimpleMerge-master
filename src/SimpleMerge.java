/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
    public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2) {
        int[] m = new int[arr1.length + arr2.length];
        int x = 0;
        int y = 0;
        for (int mm = 0; mm < m.length; mm++) {
            if (x >= arr1.length || y >= arr2.length) {
                if (x >= arr1.length) {
                    m[mm] = arr2[y];
                    y++;
                } else {
                    m[mm] = arr1[x];
                    x++;
                }
            } else {
                if (arr1[x] < arr2[y]) {
                    if (x < arr1.length) {
                        m[mm] = arr1[x];
                        x++;
                    }
                } else {
                    if (y < arr2.length) {
                        m[mm] = arr2[y];
                        y++;
                    }
                }

            }
        }
        return m;
    }
}
