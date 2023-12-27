import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 9");
        System.out.println();
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int bound = 100_000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("          Задача 9-1");
        System.out.println();
        //
        System.out.println("Ежедневные траты компании за месяц составили:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int arrSum = 0;
        for (int j : arr) {
            arrSum += j;
        }
        System.out.println("Сумма трат за месяц составила " + arrSum + ",00 рублей");
        System.out.println();
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("          Задача 9-2");
        System.out.println();
        //
        System.out.println("Ежедневные траты компании за месяц составили:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int arrSumMin = 200_000;
        int arrSumMax = 0;
        for (int i : arr) {
            if (arrSumMin > i) {
                arrSumMin = i;
            }
            if (arrSumMax < i) {
                arrSumMax = i;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + arrSumMin + ",00 рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + arrSumMax + ",00 рублей");
        System.out.println();
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("          Задача 9-3");
        System.out.println();
        //
        System.out.println("Ежедневные траты компании за месяц составили:");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        double arrSumAverage;
        int monthDayNum = 30;
        double arrSum = 0;
        for (double j : arr) {
            arrSum += j;
        }
        arrSumAverage = arrSum / monthDayNum;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", arrSumAverage);
        System.out.println();
    }

    public static void task4() {
        System.out.println("          Задача 9-4");
        System.out.println();
        //
        System.out.println("Исходный массив символов:");
        char[] arr = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Исправленный массив символов:");
        char j;
        for (int i = arr.length - 1; i >= 0; i--) {
            j = arr[i];
            System.out.print(j);
        }
        System.out.println();
    }
}