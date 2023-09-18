package BaiTap;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
//        Nhập 1 số từ 0-9, phiên âm số vừa nhập
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 0:
                System.out.printf("So %d la so Không\n", number);
                break;
            case 1:
                System.out.printf("So %d la so Một\n", number);
                break;
            case 2:
                System.out.printf("So %d la so Hai\n", number);
                break;
            case 3:
                System.out.printf("So %d la so Ba\n", number);
                break;
            case 4:
                System.out.printf("So %d la so Boons\n", number);
                break;
            case 5:
                System.out.printf("So %d la so Năm\n", number);
                break;
            case 6:
                System.out.printf("So %d la so Sáu\n", number);
                break;
            case 7:
                System.out.printf("So %d la so Bảy\n", number);
                break;
            case 8:
                System.out.printf("So %d la so Tám\n", number);
                break;
            default:
                System.out.printf("So %d la so Chín\n", number);
                break;
        }
    }
}
