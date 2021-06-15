package hw1;
// добавление в пул не до конца разобрался, извините
public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(2, 5);
        printColor(17);
        compareNumbers(2, 8);
    }

    public static void printThreeWords() {
        System.out.println("Orange ");
        System.out.println("Banana ");
        System.out.println("Apple ");
        System.out.println("sad ");
        System.out.println("saasd");



    }

    public static void checkSumSign(int a, int b) {

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");

        } else {
            System.out.println("a < b");
        }
    }
}
