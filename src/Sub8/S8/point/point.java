package Sub8.S8.point;

public class point {
    private int x, y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x; this.y = y;
    }
}


