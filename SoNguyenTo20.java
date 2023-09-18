package BaiTap;

import java.util.Scanner;

public class SoNguyenTo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        do {
            System.out.println("Nhập số n: ");
            int n = Integer.parseInt(scanner.nextLine());
            boolean check = true;
            if (n <= 1) {
                check = false;
            }
            else if (n <= 3) {
                check = true;
            }
            else if (n % 2 == 0 || n % 3 == 0) {
                check = false;
            } else {
                int i = 5;
                while (i * i <= n) {
                    if (n % i == 0 || n % (i + 2) == 0) {
                        check = false;
                        break;
                    }
                    i += 6;
                }
            }
            if (check){
                System.out.printf("%d là số nguyên tố\n",n);
                count += 1;
            }
        } while (count <= 20);
    }
}
