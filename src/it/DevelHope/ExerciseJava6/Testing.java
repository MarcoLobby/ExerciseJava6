package it.DevelHope.ExerciseJava6;

public class Testing {
    public static void main(String[] args) {

        Shape undefinedShape=new Shape();
        Shape circle=new Shape(1);
        Shape square=new Shape(4,4);
        Shape rectangle=new Shape(4, 1, 2);
        Shape triangle=new Shape(3, 1, 2,3);

        String UndefinedShape=undefinedShape.getShapeDetails();
        System.out.println(UndefinedShape);
        String Circle=circle.getShapeDetails();
        System.out.println(Circle);
        String Square=square.getShapeDetails();
        System.out.println(Square);
        String Rectangle=rectangle.getShapeDetails();
        System.out.println(Rectangle);
        String Triangle=triangle.getShapeDetails();
        System.out.println(Triangle);


    }
}
