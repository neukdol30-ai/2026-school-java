package Sub8.S8.point;


class ColorPoint extends point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(int x, int y) {
        super(x, y);
        this.color = "BLACK";
    }

    public ColorPoint() {
        super(0, 0);
        this.color = "BLACK";
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + getX() + "," + getY();
    }
}

class Point3D extends point{
    private int z;

    public int getZ(){
        return z;
    }

    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public String toString() {
        return "(" +getX()+ "," +getY()+ "," +getZ()+ ")의 점";
    }

    public void moveUp() {
        z++;
    }

    public void moveDown() {
        z--;
    }


    public void move(int x, int y, int z) {
        super.move(x,y);
        this.z = z;
    }
}

class PositivePoint extends point{

     PositivePoint(int x, int y) {
        super((x < 0) ? 0 : x, (y < 0) ? 0 : y);
    }

    public PositivePoint() {
        super(0, 0);

    }

    @Override
    public void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            super.move(x, y);
        }
    }

    public String toString() {
        return "(" +getX()+ "," +getY()+ ")의 점";
    }
}

