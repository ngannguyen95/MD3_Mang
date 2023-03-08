package rikkei.academy;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        //khai báo biến, nhập và kiểm tra kích thước
        do {
            System.out.println("Nhập vào độ dài mảng:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Không được quá 20");
            }
        } while (size > 20);
        // nhập vào các phần tử trong mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập phần tử thứ:" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        // in ra danh sách nhập
        System.out.println("Danh sách mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]+"\t");
        }
        // duyệt các phần tử trong mảng để tìm GTLN và vị trí

        int max= array[0];
        int index =1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]>max){
                max= array[j];
                index=j+1;
            }
        }
        System.out.println("Phần tử lớn nhất đứng thứ: "+index);


    }
}
