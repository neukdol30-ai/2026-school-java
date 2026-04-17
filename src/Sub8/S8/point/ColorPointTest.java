package Sub8.S8.point;

class ColorPointTest{

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "Yellow");
        String str1 = cp.toString();
        System.out.println("처음 정의된 colorPoint는 "+str1+"입니다.");
        cp.setXY(10,20);
        cp.setColor("Red");
        String str2 = cp.toString();
        System.out.println("이동한 colorPoint는 "+str2+"입니다.");
    }
}
