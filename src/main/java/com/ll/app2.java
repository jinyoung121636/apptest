package com.ll;
import java.util.ArrayList;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        ArrayList 명언 = new ArrayList();
        ArrayList 작가 = new ArrayList();
        ArrayList 명언번호1 = new ArrayList();
        int 명언번호 = 1;

        while (true) {
            System.out.print("명령) ");
            String order = sc.nextLine();
            if (order.equals("등록")) {

                System.out.print("명언: ");
                String say = sc.nextLine();
                명언.add(0,say);


                System.out.print("작가: ");
                String writer = sc.nextLine();
                작가.add(0,writer);   // index 앞에 0을 붙여주면 내림차순으로 나오게 된다.

                System.out.println(명언번호 + "번 명언이 등록되었습니다.");
                명언번호1.add(0,명언번호);
                명언번호++;
            } else if (order.equals("종료")) {
                System.exit(0);
            } else if (order.equals("목록")) {
                System.out.println(" ------------------------ ");
                for (int i = 0; i < 명언번호1.size(); i++) {
                    System.out.println(명언번호1.get(i) + "  /  " + 작가.get(i) + "  /  " + 명언.get(i));
                }
            } else if (order.startsWith("삭제? id=")){
                int 삭제번호 = Integer.parseInt(order.substring(7))-1;
                try {
                    if (삭제번호 >= 0 && 삭제번호 < 명언.size()) {
                        명언번호1.remove(삭제번호);
                        작가.remove(삭제번호);
                        명언.remove(삭제번호);
                        System.out.println((삭제번호 + 1) + "번 명언이 삭제되었습니다.");
                    }else {
                        System.out.println((삭제번호+1)+"명언은 존재하지 않습니다.");
                    }
                } catch(NumberFormatException e) {
                    System.out.println("명언은 존재하지 않습니다.");
                }
            } else {
                System.exit(0);


            }
        }
    }
}



//[
//        {
//        "id": 1,
//        "content": "명언 1",
//        "author": "작가 1"
//        },
//        {
//        "id": 2,
//        "content": "명언 2",
//        "author": "작가 2"
//        }
//        ]