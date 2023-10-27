import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("명령) ");
            String order = sc.nextLine();
            if (order.equals("종료")) {
                break;
            }
            System.out.printf("입력받은 명령어: %s\n", order);
        }
    }
}