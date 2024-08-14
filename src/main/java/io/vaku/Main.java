package io.vaku;

import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][] {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println(sumStringArray(array));
        } catch (AppArraySizeException | DataFormatException e) {
            e.printStackTrace();
        }
    }

    private static int sumStringArray(String[][] array) throws AppArraySizeException, DataFormatException {
        if (array.length != 4) {
            throw new AppArraySizeException("Array size is not equals [4][4]");
        }

        for (String[] arr : array) {
            if (arr.length != 4) {
                throw new AppArraySizeException("Array size is not equals [4][4]");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new DataFormatException("Invalid value at index [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}
