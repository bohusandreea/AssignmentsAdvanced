public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    // Your code goes here

    public void scale()
    {
        this.x=this.x/2;
        this.y=this.y/2;
    }


}
