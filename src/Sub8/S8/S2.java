package Sub8.S8;


import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double srs);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.println("바꾸고싶은 "+getSrcString()+"화를 입력하세요 >> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과 : "+res+getDestString()+"입니다.");
        sc.close();
    }
}

class Won2Dollar extends Converter{

    public Won2Dollar(int ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double srs) {
        return srs / ratio;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}

class Km2Mile extends Converter{

    public Km2Mile(double ratio) {
        this.ratio = ratio;
    }

    @Override
    protected double convert(double srs) {
        return srs / ratio;
    }

    @Override
    protected String getSrcString() {
        return "km";
    }

    @Override
    protected String getDestString() {
        return "mile";
    }
}

class ConvertTest {
    public static void main(String[] args) {
        //ratio 1200원 환율 설정
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}

class ConverTest02{
    public static void main(String[] args) {
        //ratio는 1마일이 1.6Km이기때문에 1.6으로 설정
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();
    }
}