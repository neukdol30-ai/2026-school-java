package Sub12.member;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {
    //private static final MemberRepository memberRepository = new MemoryMemberRepository();
    //private static final MemberRepository memberRepository = new FileMemberRepository();
    private static final MemberRepository memberRepository = new DataMemberRepository();

    static void main() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. 회원등록 / 2. 회원목록 조회 / 3.종료");
            System.out.print("선택 : ");
            int choice =sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    signup(sc);
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("오류");

            }
        }
    }

        private static void showAll() {
            List<Member> members = memberRepository.findAll();
            System.out.println("회원 목록 : ");
            for(Member member:members){
                System.out.printf("[ID : %s , Name : %s , Age : %d]\n",member.getId(), member.getName(), member.getAge());
            }
        }



    private static void signup(Scanner scanner){
        System.out.println();
        String id = scanner.nextLine();
        System.out.println();
        String name = scanner.nextLine();
        System.out.println();
        int age = scanner.nextInt();
        scanner.nextLine();
        Member member = new Member(id,name,age);
        memberRepository.add(member);
    }
}
