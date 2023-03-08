package rikkei.academy;

import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        // nhập giá trị cho phần tử của mảng
        do {
            System.out.print("Nhập vào kích thươc mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng không được vượt quá 20");
        } while (size > 20);
        // in mảng đã nhập
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Các phần tử của mảng " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // đảo ngược thứ tự mảng
        System.out.printf("%-20s%s", "Phần tử mảng ban đầu: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        // xử dụng biến trung gian hoán đỏi vị trí 2 phần tử
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // in ra mảng sau khi đã đảo ngược thứ tự
        System.out.printf("\n%-20s%s", "Sau khi hoán đổi: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }

}
