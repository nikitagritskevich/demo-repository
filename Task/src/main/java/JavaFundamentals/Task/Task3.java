package JavaFundamentals.Task;
//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter quantity numbers");
        int numbers = in.nextInt();
        int array[] = new int[numbers];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + (Math.random()) * 45);
        }
        System.out.println("Output with a new line transition");
        for (int elem : array) {
            System.out.println(elem);
        }
        System.out.println("Output from without switching to a new line");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        in.close();


    }
}
