import java.util.Random;

public class MAIN {
    public MAIN() {
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        int index;
        for (index = 0; index < arr.length; ++index) {
            arr[index] = random.nextInt(100);
        }
        System.out.println("Данные массива:");
        for (index = 0; index < arr.length; ++index) {
            System.out.print(arr[index] + " ");
        }

        System.out.println();

        for (index = 0; index < arr.length - 1; ++index) {
            int min = index;

            for (int scan = index + 1; scan < arr.length; ++scan) {
                if (arr[scan] < arr[min]) {
                    min = scan;
                }
            }

            int temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }
        System.out.println("Отсортированные данные массива:");
        for (index = 0; index < arr.length; ++index) {
            System.out.print(arr[index] + " ");
        }

    }
}