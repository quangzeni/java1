package BaiTap;

import java.util.Scanner;

public class TongHop {
    public static void main(String[] args) {
//        Hiển thị menu và thực hiện chức năng theo menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên");
        int number = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("******Hãy chọn một nhiệm vụ******");
            System.out.println("1. Kiểm tra chẵn lẻ");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Tính tổng các ước số nguyên");
            System.out.println("4. Kiểm tra số hoàn hảo");
            System.out.println("5. Thoát");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("=>>>>>%d là số chẵn\n____________________\n", number);
                    } else {
                        System.out.printf("=>>>>>%d là số lẻ\n____________________\n", number);
                    }
                    break;
                case 2:
                    if (number <= 1) {
                        System.out.printf("=>>>>>%d không phải số nguyên tố\n____________________\n", number);
                    }
                    if (number <= 3) {
                        System.out.printf("=>>>>>%d là số nguyên tố\n____________________\n", number);
                    }
                    if (number % 2 == 0 || number % 3 == 0) {
                        System.out.printf("=>>>>>%d không phải số nguyên tố\n____________________\n", number);
                    } else {
                        boolean count2 = true;
                        int i = 5;
                        while (i * i <= number) {
                            if (number % i == 0 || number % (i + 2) == 0) {
                                count2 = false;
                                break;
                            }
                            i += 6;
                        }
                        if (count2) {
                            System.out.printf("=>>>>>%d là số nguyên tố\n____________________\n", number);
                        } else {
                            System.out.printf("=>>>>>%d không phải số nguyên tố\n____________________\n", number);
                        }
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 1; i < number; i++) {
                        if (number%i==0){
                            sum+=i;
                            System.out.printf("%d là ước\t",i);
                        }
                    }
                    System.out.printf("=>>>>>%d có tổng các ước số nguyên là: %d\n____________________\n",number,sum);
                    break;
                case 4:
                    int sum2 = 0;
                    for (int i = 1; i < number; i++) {
                        if (number%i==0){
                            sum2+=i;
                        }
                    }
                    if (sum2 == number){
                        System.out.printf("=>>>>>%d là một số hoàn hảo\n____________________\n",number);
                    }else {System.out.printf("=>>>>>%d không phải là một số hoàn hảo\n____________________\n",number);}
                    break;
                case 5:
                    System.exit(0);
            }
        }
        while (true);
    }
}
