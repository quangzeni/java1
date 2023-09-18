package BaiTap;

public class Jump {
    public static void main(String[] args) {
//        break continue return
        for (int i = 0; i < 10; i++) {
            if (i==2){
                continue;
            }
            if (i==5){
                break;
            }
            System.out.println("i==" +i);
        }
    }
}
