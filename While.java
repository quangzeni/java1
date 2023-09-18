package BaiTap;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
//        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number==0){
                break;
            }
        }
    }
}
