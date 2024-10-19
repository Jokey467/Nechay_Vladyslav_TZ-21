import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args) {
        byte[] array1 = {5, 3, 8, 1, 2};  // Масив для сортування
        byte[] array2 = Arrays.copyOf(array1, array1.length);  // Копія для другого методу

        bubbleSortDescending(array1);
        System.out.println("Bubble Sort: " + Arrays.toString(array1));


        selectionSortDescending(array2);
        System.out.println("Selection Sort: " + Arrays.toString(array2));
    }

    public static void bubbleSortDescending(byte[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {  // Зміна на "<" для спадання
                    // Обмін елементів
                    byte temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort по спаданні
    public static void selectionSortDescending(byte[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Знаходимо індекс максимального елемента
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Обмін елементів
            byte temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
