package Sub11.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Word> list = new ArrayList<>();

        list.add(new Word("constructor", "생성자"));
        list.add(new Word("overriding", "재정의"));
        list.add(new Word("extends", "상속"));
        list.add(new Word("array", "배열"));
        list.add(new Word("string", "문자열"));
        list.add(new Word("character", "문자"));
        list.add(new Word("integer", "정수"));
        list.add(new Word("double", "실수"));
        list.add(new Word("abstract", "추상"));
        list.add(new Word("implements", "구현하다"));

        while(true){

            //문제 선별
            Word answer = list.get(random.nextInt(list.size())); //정답 생성
            ArrayList<Word> option = new ArrayList<>(); //보기 생성

            //오답 넣기
            while(option.size() < 3){
                Word word = list.get(random.nextInt(list.size()));
                if (word != answer && !option.contains((word))){//오답만 선별
                    option.add(word); //3개 우선 넣기
                }
            }

            //정답 수식
            int answerIndex = random.nextInt(4); //배열 무작위 넣기
            option.add(answerIndex, answer); //정답 넣기

            //문제 출력
            System.out.println(answer.getEnglish()+"?");
            for (int i = 0; i < option.size(); i++){
                System.out.println((i + 1) + ". " + option.get(i).getKorean());
            }

            //입력 엔진 생성
            System.out.print(">> ");
            int input = sc.nextInt();
            if(input == -1) break;

            //변수통제
            if(input<1 || input>4){
                System.out.println("ERROR");
                continue;
            }

            //정답 엔진 생성
            if (option.get(input - 1).getKorean().equals(answer.getKorean())){
                System.out.println("정답");
            }else{
                System.out.println("오답");
            }

            System.out.println();

        }
    }
}

class Word{
    String english;
    String korean;

    public Word(String english, String korean) {
        this.english = english;
        this.korean = korean;
    }

    String getEnglish(){
        return english;
    }

    String getKorean(){
        return korean;
    }
}
