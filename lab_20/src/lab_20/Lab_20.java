package lab_20;
class Shape{
    private int positionX;
    private int positionY;
    private char color = 'B';
    public Shape(){ positionX = positionY = 0;}
    public Shape(int newX, int newY){
        positionX = newX;
        positionY = newY;
    }
    public void changeColor(char newcolor){
        switch(newcolor){
            case 'R' :
            case 'B' :
            case 'Y' : color = newcolor; break;
            default : System.out.println("Wrong color.."); break;
        }
    }
    public void changePosition(int newX, int newY){
        positionX = newX;
        positionY = newY;
    }
    public void displayShape(){
        System.out.println("This shape is at " +positionX+ " on x-axis.");
        System.out.println("This shape is at " +positionY+ " on y-axis.");  
        switch(color){
            case 'R' : System.out.println("This shape is red"); break;
            case 'B' : System.out.println("This shape is black"); break;
            case 'Y' : System.out.println("This shape is yellow"); break;
            default : System.out.println("Wrong color.."); break;
        }
    }
    public void displayColor(){
        switch(color){
            case 'R' : System.out.println("It is red"); break;
            case 'B' : System.out.println("It is black"); break;
            case 'Y' : System.out.println("It is yellow"); break;
            default : System.out.println("Wrong color.."); break;
        }
        System.out.println("It is at "+positionX+" on x-axis and "+positionY+" on y-axis.");
    }
}
class Triangle extends Shape{
    protected float heightbase;
    protected float lengthbase;
    protected float areaTri;
    public Triangle(){ heightbase = lengthbase = 0;}
    public Triangle(float h, float b){
        heightbase = h;
        lengthbase = b;
    }
    public float computeArea(){
        areaTri = 0.5f * heightbase * lengthbase;
        return areaTri;
    }
    @Override
    public void displayShape(){
        super.displayShape();
        System.out.println("This shape is Triangle with height = " +heightbase+ " and base = " +lengthbase);
        System.out.println("Triangle area is = " +areaTri);
    } 
    public void displayPrism(){
        super.displayColor();
    }
}
class Rectangle extends Shape{
    protected int width;
    protected int length;
    protected int areaRec;
    public Rectangle(){ width = length = 0;}
    public Rectangle(int w, int l){
        width = w;
        length = l;
    }
    public int computeArea(){
        areaRec = width * length;
        return areaRec;
    }
    @Override
    public void displayShape(){
        super.displayShape();
        System.out.println("This shape is Rectangle with width = " +width+ " and length = " +length);
        System.out.println("Rectangle area is = " +areaRec);
    }
    public void displayBox(){
        super.displayColor();
    }
}
class Circle extends Shape{
    protected float radius;
    protected float areaRad;
    protected final float PI = 3.14159f;
    public Circle(){ radius = 0;}
    public Circle(float r){
        radius = r;
    }
    public float computeArea(){
        areaRad = PI * radius * radius;
        return areaRad;
    }
    @Override
    public void displayShape(){
        super.displayShape();
        System.out.println("This shape is Circle with radius = " +radius);
        System.out.println("Circle area is = " +areaRad);
    }
    public void displayCylinder(){
        super.displayColor();
    }
}
class Prism extends Triangle{
    protected float height;
    protected float areaPri;
    public Prism(){ height = 0;}
    public Prism(float h, float l, float newh){
        super(h,l);
        height = newh;
    }
    public float computeVolume(){
        areaPri = heightbase * lengthbase * height;
        return areaPri;
    }
    @Override
    public void displayPrism(){
        System.out.println("This shape is Prism with heightbase = " +heightbase);
        System.out.println("                         lengthbase = " +lengthbase);
        System.out.println("                             height = " +height);
        System.out.println("                    Prism volume is = " +areaPri);
        super.displayPrism();
    }
}
class Box extends Rectangle{
    protected int height;
    protected int areaBox;
    public Box(){ height = 0;}
    public Box(int w, int l, int h){
        super(w,l);
        height = h;
    }
    public int computeVolume(){
        areaBox = width * length * height;
        return areaBox;
    }
    @Override
    public void displayBox(){
        System.out.println("This shape is Box with width = " +width);
        System.out.println("                      length = " +length);
        System.out.println("                      height = " +height);
        System.out.println("               Box volume is = " +areaBox);
        super.displayBox();
    }
}
class Cylinder extends Circle{
    protected float height;
    protected float areaCyl;
    public Cylinder(){ height = 0;}
    public Cylinder(int r, int h){
        super(r);
        height = h;
    }
    public Cylinder(char c){ super(c);}
    public float computeVolume(){
        areaCyl = PI * radius * radius * height;
        return areaCyl;
    }
    @Override
    public void displayCylinder(){
        System.out.println("This shape is Cylinder with radius = " +radius);
        System.out.println("                            height = " +height);
        System.out.println("                Cylinder volume is = " +areaCyl);
        super.displayCylinder();
    }
}
public class Lab_20 {
    public static void main(String[] args) {
       System.out.println("-------Triangle------");
       Triangle tri = new Triangle(5,6);
       tri.changePosition(3, 4);
       tri.changeColor('B');
       tri.computeArea();
       tri.displayShape();
       System.out.println();
       System.out.println("------Rectangle------");
       Rectangle rec = new Rectangle(5,10);
       rec.changePosition(9, 9);
       rec.changeColor('Y');
       rec.computeArea();
       rec.displayShape();
       System.out.println();
       System.out.println("-------Circle--------");
       Circle cir = new Circle(20);
       cir.changePosition(4, 5);
       cir.changeColor('R');
       cir.computeArea();
       cir.displayShape();
       System.out.println();
       System.out.println("--------Prism--------");
       Prism pri = new Prism(1,2,12);
       pri.computeVolume();
       pri.changeColor('Y');
       pri.changePosition(10, 20);
       pri.displayPrism();
       System.out.println();
       System.out.println("----------Box--------");
       Box box = new Box(5,4,3);
       box.computeVolume();
       box.changeColor('B');
       box.changePosition(50, 6);
       box.displayBox();
       System.out.println();
       System.out.println("-------Cylinder------");
       Cylinder cyl = new Cylinder(9,10);
       cyl.computeVolume();
       cyl.changeColor('R');
       cyl.changePosition(12, 10);
       cyl.displayCylinder();
    }
    
}
