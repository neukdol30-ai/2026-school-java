package Sub9.enumeration.Sub2;

import java.util.Scanner;

public class enumGradeTest {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("등급을 입력하세요 : ");
        String input = sc.nextLine();
        System.out.println();

        enumGrade gradeinput = enumGrade.valueOf(input);

        System.out.println(input);

        switch(gradeinput){
            case BASIC :
                System.out.println("기본 회원입니다");
                break;
            case GOLD:
                System.out.println("골드 회원입니다");
                break;
            case DIAMOND:
                System.out.println("다이아 회원입니다");
                break;
            default:
                System.out.println("존재하지 않는 등급입니다.");
                break;
        }

        enumGrade grade = enumGrade.GOLD;

        switch(grade){
            case BASIC :
                System.out.println("기본 회원입니다");
                break;
            case GOLD:
                System.out.println("골드 회원입니다");
                break;
            case DIAMOND:
                System.out.println("다이아 회원입니다");
                break;
            default:
                System.out.println("존재하지 않는 등급입니다.");
                break;
        }



//        enumGrade grade1 = enumGrade.BASIC;
//        enumGrade grade2 = enumGrade.GOLD;
//        enumGrade grade3 = enumGrade.DIAMOND;

//        System.out.println(grade1.name() +" : "+ grade1.ordinal());
//        System.out.println(grade2.name() +" : "+ grade2.ordinal());
//        System.out.println(grade3.name() +" : "+ grade3.ordinal());

        for(enumGrade gradetest : enumGrade.values()){
            System.out.println(gradetest.name() +" : "+ gradetest.ordinal());
        }

        String str="GOLD";

        enumGrade gradeex1 = enumGrade.valueOf(str);

        System.out.println(gradeex1);
        System.out.println(gradeex1.getClass().isEnum());

        String str2 = "VIP";

        try {
            enumGrade gradeEx2 = enumGrade.valueOf(str2);
            System.out.println(gradeEx2);
        } catch (IllegalArgumentException e) {
            System.out.println("존재하지 않는 등급입니다.");
        }




    }
}
