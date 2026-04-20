package Sub9.lang.object.final01;

public class Immutable {
    private final int value;


    public Immutable(int value){
        this.value = value;
    }


    public int getValue(){
        return value;
    }


    public Immutable add(int addValue){
        int result = value + addValue;
        return new Immutable((result));
    }


}
