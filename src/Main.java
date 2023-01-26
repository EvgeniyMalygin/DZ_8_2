import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходный массив: " + Arrays.toString(arrayInt));
        System.out.println("Полученный массив: " + Arrays.toString(reverseArray(arrayInt)));
    }

    private static int[] reverseArray(int[] arrayInt) {
        int temp;
        for(int i = 0; i < arrayInt.length / 2; i++){
            temp = arrayInt[i];
            arrayInt[i] = arrayInt[arrayInt.length - 1 - i];
            arrayInt[arrayInt.length - 1 - i] = temp;
        }
        return arrayInt;
    }
}