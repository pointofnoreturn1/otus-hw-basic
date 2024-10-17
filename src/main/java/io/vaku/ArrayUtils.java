package io.vaku;

public class ArrayUtils {
    public static void main(String[] args) {

    }

    public int[] filterArray(int[] array) {
        int idx = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 1) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            int[] res = new int[array.length - idx - 1];
            System.arraycopy(array, idx + 1, res, 0, res.length);

            return res;
        }

        throw new RuntimeException("No digits 1 in array");
    }

    public boolean checkArray(int[] array) {
        boolean hasOne = false;
        boolean hasTwo = false;
        boolean hasNoOtherDigits = true;

        for (int i : array) {
            if (i == 1) {
                hasOne = true;
                continue;
            }

            if (i == 2) {
                hasTwo = true;
                continue;
            }

            hasNoOtherDigits = false;
        }

        return hasOne && hasTwo && hasNoOtherDigits;
    }
}
