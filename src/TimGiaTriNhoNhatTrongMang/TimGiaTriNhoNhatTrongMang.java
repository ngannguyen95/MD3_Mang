package TimGiaTriNhoNhatTrongMang;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nập vào kích thước mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng không được vượt quá 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Phần tử thứ :" + (i + 1) + " của mảng: ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int index = minValue(arr);
        System.out.println("Gía trị nhỏ nhất mảng: " + arr[index]);

    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
