package BaiTap;

import java.util.Scanner;

public class UseForDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên dương");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (i%2==0){
                System.out.printf("Từ 1 tơi %d co số %d la sô chắn\n", number,i);
            }
        }
    }
}
