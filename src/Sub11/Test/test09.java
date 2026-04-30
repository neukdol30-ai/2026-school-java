package Sub11.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class test09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nation> nation = new ArrayList<>();
        HashMap<String, String> nationMap = new HashMap<>();

        while (true) {
            System.out.println("1. 입력/ 2. 시작/ 3. 종료");
            int choose = sc.nextInt();

            switch (choose) {

                case 1:
                    while (true) {
                        String country = sc.next();
                        if (country.equals("stop")) break;
                        String capital = sc.next();
                        nation.add(new Nation(country, capital));
                    }
                    break;

                case 2:
                    for (Nation n : nation) {
                        nationMap.put(n.getCountry(), n.getCapital());
                    }
                    if (nationMap.size() == 0) {
                        System.out.println("먼저 나라와 수도를 입력하세요.");
                        break;
                    }
                    ArrayList<String> countries = new ArrayList<>(nationMap.keySet());
                    Random random = new Random();
                    while (true) {
                        String country = countries.get(random.nextInt(countries.size()));
                        System.out.println(country);
                        String input = sc.next();
                        if (input.equals("stop")) {
                            break;
                        }
                        String correct = nationMap.get(country);
                        if (input.equals(correct)) {
                            System.out.println("정답입니다");
                        } else {
                            System.out.println("정답이 아닙니다");
                        }
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("잘못 입력 했습니다");

            }

        }
    }
}


class Nation{
    String country;
    String capital;

    public Nation(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    String getCountry(){
        return country;
    }

    String getCapital(){
        return capital;
    }
}
