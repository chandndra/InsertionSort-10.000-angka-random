import java.util.*;

public class Main {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String a[]) {
        int[] rand_array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            int rand_number = random.nextInt(101);
            while (rand_number % 2 != 0 || rand_number == 0) {
                rand_number = random.nextInt(101);
            }
            rand_array[i] = rand_number;
        }
        for (int x = 0; x < rand_array.length; x++) {
            System.out.print(rand_array[x] + " ");
        }
        System.out.println();

        insertionSort(rand_array);// sorting array dengan menggunakan Insertion Sort

        System.out.println("Hasil Setelah dilakukan Sorting dengan Insertion Sort : ");
        for (int i : rand_array) {
            System.out.print(i + " ");
        }
    }
}
