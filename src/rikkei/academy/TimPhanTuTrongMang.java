package rikkei.academy;

import java.util.Scanner;

public class TimPhanTuTrongMang {
    public static void main(String[] args) {
        String[] students = {"A", "B", "C", "D"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên  tìm kiếm: ");
        String name = scanner.nextLine();
        boolean isExit= false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Tên "+name+" đứng thứ "+i);
                isExit=true;
                break;
            }
        }
        if(!isExit){
            System.out.println("Không tìm thấy trong danh sách");
        }
    }
}
