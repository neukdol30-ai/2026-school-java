package Sub8.S8.Stack;

public class StringStack implements Stack{

    private String words[];
    private int num;

    public StringStack (String capacity){
        this.words = new String[capacity];
        num = 0;

    }

    @Override
    public int length() {
        return num + 1;
    }

    @Override
    public int capacity() {
        return words.length;
    }

    @Override
    public String pop() {
        return "그만";
    }

    @Override
    public boolean push(String val) {
        return false;
    }
}
