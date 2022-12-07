package it.DevelHope.ExerciseJava6;

public class Shape {
   public String shapeName;
   public int numberOfEdges;

   public Shape(){
      shapeName="Undefined shape";
      System.out.println("The object Shape has been created");
   }

   public Shape(double radius){
      shapeName="Circle";
      System.out.println("The object circle has been created");

   }

   public Shape(int edges, double edgeLength){
      shapeName="Square";
      numberOfEdges=4;
      System.out.println("The object square has been created");

   }

   public Shape(int edges, double e1, double e2){
      shapeName="Rectangle";
      numberOfEdges=4;
      System.out.println("The object rectangle has been created");

   }

   public Shape(int edges,double e1, double e2, double e3){
      shapeName="Triangle";
      numberOfEdges=3;
      System.out.println("The object triangle has been created");

   }

   public String getShapeDetails(){
      return shapeName + " " + numberOfEdges;
   }
}

