package JavaFundamentals.OptionalTask1;
//1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class Task1 extends Scann {
    public void main() {
        int n = in.nextInt();
        System.out.println("Enter n");
        String string[] = new String[n];

        for (int i = 0; i < string.length; i++) {
            string[i] = in.next();
        }
        String maxStr = string[0];
        String minStr = string[0];
        int min = string[0].length();
        int max = string[0].length();
        for (int i = 0; i < string.length; i++) {
            if (min < string[i].length()) {
                min = string[i].length();
                minStr = string[i];
            }
            if (max > string[i].length()) {
                max = string[i].length();
                maxStr = string[i];
            }

        }
        System.out.println("Max number= " + maxStr + ", and their length is= " + max);
        System.out.println("Min number= " + minStr + ", and their length is= " + min);
        in.close();
    }


    public static void main(String[] args) {
        new Task1().main();
    }
}