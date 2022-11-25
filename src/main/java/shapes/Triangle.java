package shapes;

public class Triangle extends CorneredShape implements IShape{
    private double base;
    private double side1;
    private double side2;

    public Triangle(double base, double side1, double side2){
        super(3);
        this.base = base;
        this.side1 =side1;
        this.side2 =side2;
    }
    public double getArea(){
        return (side1 * base)/2;
    }
    public static void main(String[] args){
        Triangle myTriangle = new Triangle(15,20,25);
        Circle myCircle = new Circle(10);
        Integer myNum = 4;
        if(myTriangle instanceof IShape){
        //    IRound myRoundShape = (IRound) myTriangle;
            System.out.println("Good to go!");
        }else
            System.out.println("bad");
        IShape myShape = (IShape) myCircle;
        System.out.println(myTriangle instanceof IShape);
        System.out.println();
    }
}
