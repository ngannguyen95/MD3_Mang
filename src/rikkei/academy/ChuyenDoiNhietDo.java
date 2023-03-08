package rikkei.academy;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Độ F sang C");
            System.out.println("2. Độ C sang F");
            System.out.println("3.Exit");
            System.out.println("Chọn đi ạ:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào độ F:");
                    F = scanner.nextDouble();
                    System.out.println("Độ C: " + FtoC(F));
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào độ C:");
                    C = scanner.nextDouble();
                    System.out.println("Độ F: " + CtoF(C));
                    break;
                }
                case 0:
                    System.exit(0);
            }


        } while (choice != 0);
    }

    public static double CtoF(double C) {
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double FtoC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }
}
