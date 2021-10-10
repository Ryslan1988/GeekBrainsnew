package Java3HW6;

import java.util.Arrays;

public class Java3HW6 {
    public static void main(String[] args) {

        int arr[] = { 1,2, 5, 6, 23, 8, 7, 23,4, 3, 5, 6, 3, 2, 3, 5};
        massive(arr);
        System.out.println(checkFourOreOne(arr));
    }

    public static void massive(int[] ars) {
        System.out.println(Arrays.toString(getNumberAfterFour(ars)));
    }

    public static int[] getNumberAfterFour(int[] ars) throws RuntimeException {
        int findFour = -1;
        for (int i = ars.length - 1; i >= 0; i--) {
            if (ars[i] == 4) {
                findFour = i;
                break;
            }
        }
        if (findFour == -1) {
            throw new RuntimeException();
        } else {
            return Arrays.copyOfRange(ars, findFour + 1, ars.length);
        }
    }
    public static boolean checkFourOreOne(int[] ints) {
        boolean numberOne, numberFour = false;
        numberOne = numberFour = false;
        for (int number : ints) {
            numberOne |= number == 1;
            numberFour |= number == 4;
            if (numberOne && numberFour) {
                return true;
            }
        }
        return false;
    }

}


