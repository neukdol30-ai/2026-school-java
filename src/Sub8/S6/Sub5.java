package Sub8.S6;

import java.util.Scanner;

public class Sub5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String []productArray = new String[20];
        int []priceArray = new int[20];
        int input = 0;
        int count = 0;

        while(input != 3) {
            System.out.println("--------");
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료");
            System.out.print("메뉴를 선택하시오 : ");
            input = sc.nextInt();

            if(input == 1){
                if(count >= productArray.length){
                    System.out.println("상품 저장 초과");
                    continue;
                }
                System.out.print("제품명 : ");
                productArray [count] = sc.next();
                System.out.print("가치 : ");
                priceArray [count] = sc.nextInt();
                count++;
            } else if(input == 2){
                if(count == 0){
                    System.out.println("등록된 상품이 없습니다.");
                }
                for (int i = 0; i < count; i++) {
                    System.out.println(productArray[i] + " | " + priceArray[i]);
                }
            }

        }

        System.out.println("프로그램을 종료합니다.");
    }
}
