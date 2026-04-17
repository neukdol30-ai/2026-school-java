package Sub8.S7;

public class Sub4 {
    static void main() {
        int[] values = {1,2,3,4,5};

        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}

class MathArrayUtils{
    private MathArrayUtils() {
    }

    public static int sum(int[] values){
        int sum = 0;
        for(int value : values){
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values){
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values){
        int min = values[0];
        for(int value : values){
            //min = (value < min) ? value : min;
            min = Math.min(value, min);
        }
        return min;
    }

    public static int max(int[] values){
        int max = 0;
        for(int value : values){
            //max = (value > max) ? value : max;
            max = Math.max(value, max);
        }
        return max;
    }





}