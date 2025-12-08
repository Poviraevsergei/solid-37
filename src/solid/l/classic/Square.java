package solid.l.classic;

public class Square {
    public int side;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public long getArea(){
        return side * side;
    }
}
