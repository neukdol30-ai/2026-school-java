package Sub3;

import java.util.Scanner;


public class sub9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String [] ex = {"가위", "바위", "보"};

        int win = 0;
        int lose = 0;


        int stop = 99;

        while(true){
            System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
            System.out.println("1. 가위, 2. 바위, 3. 보, 99. 종료");

            int user = sc.nextInt();

            if (user == stop){
                System.out.printf("최종점수 : 사용자 = %d, 컴퓨터 = %d", win, lose);
                break;
            }

            if (user < 1 || user > 3) {
                System.out.println("잘못 입력했습니다.");
                continue;
            }

            int bot = (int)(Math.random()*3+1);

            if (user == bot) {
                System.out.printf("사용자 = %s, 컴퓨터 = %s, 비겼습니다%n",ex[user - 1], ex[bot - 1]);
            } else if (
                    (user == 1 && bot == 3) || (user == 2 && bot == 1) || (user == 3 && bot == 2)
            ) {
                System.out.printf("사용자 = %s, 컴퓨터 = %s, 이겼습니다%n",ex[user - 1], ex[bot - 1]);
                win++;
            } else {
                System.out.printf("사용자 = %s, 컴퓨터 = %s, 졌습니다%n",ex[user - 1], ex[bot - 1]);
                lose++;
            }
            System.out.printf("%d : %d%n", win, lose);
        }
    }
}
