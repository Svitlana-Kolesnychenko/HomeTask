package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

//        Task 0. Написать метод который конвертирует цифровое значение в строку.
        int input0 = 454;
        String task0Result = task0(input0);
        System.out.println("Result of task 0: " + task0Result);

//        Task 1. Написать метод, который принимает целое число, и возвращает его сумму цифр.
        int input1 = 1985;
        int task1Result = task1(input1);
        System.out.println("Result of task 1: " + task1Result);

//        Task 2. Написать метод, который принимает пустой массив из 100 элементов, и заполняет его первыми 100 простыми числами.
        int arr2[] = new int[100];
        int[] task2Result = task2(arr2);
        System.out.println("Result of task 2: " + (Arrays.toString(task2Result)));

//        2.1 (Опционально) Добавить метод принимающий произвольный размер массива, создающий его и переиспользующий task2 для решения
        int[] arr2_1 = new int[105];
        int[] task2_1Result = task2_1(arr2_1);
        System.out.println("Result of task 2_1: " + (Arrays.toString(task2_1Result)));

//        Task 3. Написать метод, который принимает массив целых чисел произвольного размера, и возвращает среднее арифметическое этих чисел (учтите, что оно может быть нецелым).
        int[] arr3 = {1, 1, 3, 3, 5, 5, 7, 7, 9};
        double task3Result = task3(arr3);
        System.out.println("Result of task 3: " + task3Result);

//        3.1(Опционально) Добавить метод расчитывающий среднее геометрическое
        double task3_1Result = task3_1(arr3);
        System.out.println("Result of task 3_1: " + task3_1Result);

//        3.2 (Опционально) Добавить возможность возможность ввода цифр с клавиатуры с использованием Scanner(System.in))
        Scanner num3_2 = new Scanner(System.in);
        double task3_2Result = task3_2(num3_2);
        System.out.println("Result of task 3_2: " + task3_2Result);

//        Task 4. Написать метод, который принимает массив произвольной длины целых чисел, и возвращает отсортированный по возрастанию. Выбрать реализацию одного/нескольких/или всех опциональных методов сортировки.
        int[] arr4 = {48, 24, 7, 98, 13, 1, 32, 56, 82, 67};
        System.out.println("Source array: " + (Arrays.toString(arr4)));
//        Сортировка пузырьком
        int[] task4ResultB = task4Booble(arr4);
        System.out.println("Result of task 4 (bubble method): " + (Arrays.toString(task4ResultB)));
//        Быстрая сортировка
        int[] task4ResultQS = task4QS(arr4, 0, arr4.length-1);
        System.out.println("Result of task 4 (quick sort): " + (Arrays.toString(task4ResultQS)));

//        Task 5. Написать метод, который принимает 2 строки: подстроку и основную строку. Возвращает количество включений подстроки в основную строку (игнорируя кейс, т.е. большая и маленькая буква считаются одной и той же).
        String str = "Java School allows you to try java programming language on practice. Java one of the most popular programming languages. I love Java!!!";
        String subStr = "Java";
//        "Наивный" алгоритм
        int task5Result = task5(str, subStr);
        System.out.println("Result of task 5: " + task5Result);

//        Агоритм Кнутта-Морриса-Пратта
//        5.1 Добавить метод который будет не просто считать, а возвращать массив индексов начала каждого из включений
        ArrayList<Integer> task5_1Result = task5_1KMP(str, subStr);
        System.out.println("Result of task 5_1:" + Arrays.toString(task5_1Result.toArray()));

//        5.2 (Опционально) реализовать возможность ввода 2х строк с клавиатуры с использованием Scanner(System.in)
        Scanner str5_2 = new Scanner(System.in);
        ArrayList<Integer> task5_2Result = task5_2(str5_2);
        System.out.println("Result of task 5_2:" + Arrays.toString(task5_2Result.toArray()));


    }

    public static String task0(int input0) {
        return String.valueOf(input0);
    }

    public static int task1(int input1) {
        String inputString = task0(input1);
        int sum = 0;
        char[] index = inputString.toCharArray();
        for (int i = 0; i < index.length; i++) {
            sum = sum + Character.getNumericValue(index[i]);
        }
        return sum;
    }

    //    public static int[] task2(int [] arr2) {
//        int i = 0, count = 0, a = 0;
//        int n = 2;
//
//        while (count < arr2.length) {
//            for (i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    break;
//                }
//
//            }
//            if (i == n) {
//                arr2[count] = i;
//                count++;
//
//            }
//            n++;
//
//        }
//        return arr2;
//    }
    public static int[] task2(int[] arr2) {
        int i = 0, count = 0, a = 0;
        int n = 2;
        while (count < 100) {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                arr2[count] = i;
                count++;
            }
            n++;
        }
        return arr2;
    }

    public static int[] task2_1(int[] arr2_1) {
        int i = 0;
        int a = 0;
        int[] arr2_3 = new int[100];
        int[] task2_1 = task2(arr2_3);
        for (i = 0; i < arr2_1.length; i++) {
            arr2_1[i] = task2_1[a];
            a++;
            if (a > 99) {
                a = 0;
            }
        }
        return arr2_1;
    }

    public static double task3(int[] arr3) {
        int i = 0;
        int sum = 0;
        double result = 0;
        for (i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }
        result = (double) sum / arr3.length;
        return result;
    }

    public static double task3_1(int[] arr3) {
        int i = 0;
        int proiz = 1;
        double result = 0;
        for (i = 0; i < arr3.length; i++) {
            proiz *= arr3[i];
        }
        result = Math.sqrt((double) proiz);
        return result;
    }

    public static double task3_2(Scanner num3_2) {
        System.out.print("Enter array length: ");
        int size = num3_2.nextInt();
        int[] arr3 = new int[size];
        System.out.println("Enter a number into an array: ");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = num3_2.nextInt();
        }
        double result = task3(arr3);
        return task3(arr3);
    }

    public static int[] task4Booble(int[] arr4) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr4.length - 1; i++) {
                if (arr4[i] > arr4[i + 1]) {
                    isSorted = false;
                    int temp = arr4[i];
                    arr4[i] = arr4[i + 1];
                    arr4[i + 1] = temp;
                }
            }
        }
        return arr4;
    }
    public static int[] task4QS( int[] arr4, int from, int to) {
        if (from < to) {
            int divIndex = partition (arr4, from, to);
            task4QS (arr4, from,divIndex-1);
            task4QS (arr4, divIndex, to);
        }
        return arr4;
    }
    private static int partition (int [] arr4, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr4[from];
        while (leftIndex <= rightIndex) {
            while (arr4[leftIndex] < pivot) {
                leftIndex ++ ;
            }
            while (arr4[rightIndex] > pivot) {
                rightIndex -- ;
            }
            if (leftIndex <= rightIndex) {
                swap (arr4, rightIndex, leftIndex);
                leftIndex ++ ;
                rightIndex -- ;
            }
        }
        return leftIndex;
    }
    private static void swap (int[] arr4, int index1 , int index2) {
        int tmp   = arr4[index1];
        arr4[index1] = arr4[index2];
        arr4[index2] = tmp;
    }
    public static int task5(String str, String subStr) {
        String str2 = str.toLowerCase();
        String subStr2 = subStr.toLowerCase();
        ArrayList<Integer> foundPositions = new ArrayList<>();
        int a = foundPositions.size();
        for (int i = 0; i < str2.length(); i++) {
            int j = 0;
            while (j < subStr2.length() && i + j < str2.length() && subStr2.charAt(j) == str2.charAt(i + j)) {
                j++;
            }
            if (j == subStr2.length()) {
                foundPositions.add(i);
                a++;
            }
        }
        return a;
    }

    public static int[] task5_1PreFun (String subStr){
        String subStr2 = subStr.toLowerCase();
        int[] value = new int[subStr2.length()];
        for (int i = 1; i < subStr2.length(); i++) {
            int j = 0;
            while (i + j < subStr2.length() && subStr2.charAt(j) == subStr2.charAt(i + j)) {
                value[i + j] = Math.max(value[i + j], j + 1);
                j++;
            }
        }
        return value;
    }

    public static ArrayList<Integer> task5_1KMP (String str, String subStr){
        String str2 = str.toLowerCase();
        String subStr2 = subStr.toLowerCase();
        ArrayList<Integer> index = new ArrayList<>();
        int[] prefixFunc = task5_1PreFun(subStr);
        int i = 0;
        int j = 0;
        while (i < str2.length()) {
            if (subStr2.charAt(j) == str2.charAt(i)) {
                j++;
                i++;
            }
            if (j == subStr2.length()) {
                index.add(i - j);
                j = prefixFunc[j - 1];
            } else if (i < str2.length() && subStr2.charAt(j) != str2.charAt(i)) {
                if (j != 0) {
                    j = prefixFunc[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
        return index;
    }

    public static ArrayList<Integer> task5_2 (Scanner str5_2) {
        System.out.println("Enter string text: ");
        String str = str5_2.nextLine();
        System.out.println("Enter substring text: ");
        String subStr = str5_2.nextLine();
        ArrayList<Integer> task5_2 = task5_1KMP(str, subStr);
        return task5_2;
    }

}


















