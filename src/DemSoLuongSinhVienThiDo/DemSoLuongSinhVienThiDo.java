package DemSoLuongSinhVienThiDo;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số lượng sinh viên: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Số lượng sinh viên không được vượt quá 30");
        } while (size > 30);
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Điểm sinh viên thứ " + (i + 1) + " :");
            arr[i]=scanner.nextInt();
        }
        int count = 0;
        System.out.println("Danh sách điểm đỗ:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Số sinh viên đỗ: "+count);
    }
}
