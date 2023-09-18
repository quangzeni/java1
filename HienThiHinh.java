package BaiTap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("******Hãy chọn một nhiệm vụ******");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông cạnh góc vuông ở bên trái phía dưới");
            System.out.println("3. In hình tam giác vuông cạnh góc vuông ở bên trái phía trên");
            System.out.println("4. In hình tam giác cân");
            System.out.println("5. Thoát");
            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case 1:
                    System.out.print("Nhập chiều dài hình chữ nhật (một số nguyên):");
                    int dai = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập chiều rộng hình chữ nhật (số nguyên):");
                    int rong = Integer.parseInt(scanner.nextLine());
                    System.out.println("Đây là hình vuông của bạn:");
                    for (int i = 1; i <= rong; i++) {
                        for (int j = 1; j <= dai; j++) {
                            if (j < dai) {
                                System.out.print("*\t");
                            } else {
                                System.out.print("*\n");
                            }
                        }
                    }
                    System.out.println("________________________________________");
                    break;
                case 2:
                    System.out.print("Nhập chiều dài cạnh góc vuông hình tam giác (số nguyên):");
                    int canhTamGiac = Integer.parseInt(scanner.nextLine());
                    System.out.println("Đây là hình tam giác của bạn:");
                    for (int i = 1; i <= canhTamGiac; i++) {
                        for (int j = 1; j <= i; j++) {
                            if (j < i) {
                                System.out.print("*\t");
                            } else {
                                System.out.print("*\n");
                            }
                        }
                    }
                    System.out.println("________________________________________");
                    break;
                case 3:
                    System.out.print("Nhập chiều dài cạnh góc vuông hình tam giác (số nguyên):");
                    int canhTamGiacNguoc = Integer.parseInt(scanner.nextLine());
                    System.out.println("Đây là hình tam giác của bạn:");
                    for (int i = canhTamGiacNguoc; i >=1 ; i--) {
                        for (int j = 1; j <= i; j++) {
                            if (j < i) {
                                System.out.print("*\t");
                            } else {
                                System.out.print("*\n");
                            }
                        }
                    }
                    System.out.println("________________________________________");
                    break;
                case 4:
                    System.out.print("Nhập chiều cao của hình tam giác cân (số nguyên):");
                    int chieuCaoTamGiacCan = Integer.parseInt(scanner.nextLine());
                    System.out.println("Đây là hình tam giác của bạn:");
                    for (int i = 1; i <= chieuCaoTamGiacCan; i++) {
                        for (int j = 1; j <= chieuCaoTamGiacCan-i; j++) {
                            System.out.print("\t");
                        }
                        for (int k = 1; k <= 2*i-1; k++) {
                            System.out.print("*\t");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("________________________________________");
                    break;
                case 5:
                    System.exit(0);
            }
        }
        while (true);
    }
}
