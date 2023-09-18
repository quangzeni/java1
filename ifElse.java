package BaiTap;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dữ liệu vào");
        int integerNumber = scanner.nextInt();
        if (integerNumber % 5 == 0) {
            System.out.printf("%d chia hết cho 5\n", integerNumber);
        } else if (integerNumber % 5 == 1) {
            System.out.printf("%d chia cho 5 dư 1\n", integerNumber);
        } else if (integerNumber % 5 == 2) {
            System.out.printf("%d chia cho 5 dư 2\n", integerNumber);
        } else if (integerNumber % 5 == 3) {
            System.out.printf("%d chia cho 5 dư 3\n", integerNumber);
        } else {
            System.out.printf("%d chia cho 5 dư 4\n", integerNumber);
        }
    }
}
