class Box {
    int length, breadth, height;

    public Box() {

    }

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public Box(int side) {
        this.length = this.breadth = this.height = side;
    }

    public void calculateVolume() {
        System.out.println(this.length * this.breadth * this.height);
    }
}

public class MainConstructorOverloading {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.calculateVolume();

        Box cuboidalBox = new Box(4, 5, 6);
        cuboidalBox.calculateVolume();

        Box cube = new Box(6);
        cube.calculateVolume();
    }
}
