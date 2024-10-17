import java.util.Scanner;

class ThreeDObject{
   double Area,Volume;
   void wholeSurfaceArea(){}
   void volume(){}
}
class Box extends ThreeDObject
{
   double length,breadth,height;
   Box(double length,double breadth,double height){
      this.length = length;
      this.breadth = breadth;
      this.height = height;
   }
   void wholeSurfaceArea(){
      super.Area = 2*length*breadth + 2*breadth*height + 2*height*length;
      System.out.println("Whole Surface Area is: "+super.Area);
   }
   void volume(){
      super.Volume = length*breadth*height;
      System.out.println("Volume is: "+super.Volume);
   }
}
class Cube extends ThreeDObject
{
   double length;
   Cube(double length){
      this.length = length;
   }
   void wholeSurfaceArea(){
      super.Area = 6*length*length;
      System.out.println("Whole Surface Area is: "+super.Area);
   }
   void volume(){
      super.Volume = Math.pow(length,3);
      System.out.println("Volume is: "+super.Volume);
   }
}
class Cylinder extends ThreeDObject
{
   double rad,height;
   Cylinder(double rad,double height){
      this.rad = rad;
      this.height  = height;
   }
   void wholeSurfaceArea(){
      super.Area = 6.28*rad*(rad+height);
      System.out.println("Whole Surface Area is: "+super.Area);
   }
   void volume(){
      super.Volume = 3.14*Math.pow(rad,2)*height;
      System.out.println("Volume is: "+super.Volume);
   }
}
class Cone extends ThreeDObject
{
   double rad,height;
   Cone(double rad,double height){
      this.rad = rad;
      this.height = height;
   }
   void wholeSurfaceArea(){
      double root = Math.sqrt(Math.pow(height,2)+Math.pow(rad, 2));
      super.Area = 3.14*rad*(rad+root);
      System.out.println("Whole Surface Area is: "+super.Area);
   }
   void volume(){
      super.Volume = 3.14*Math.pow(rad,2)*(height/3);
      System.out.println("Volume is: "+super.Volume);
   }
}
class main{
   public void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("1 for Box\n2 for Cube\n3 for Cylinder\n4 for Cone\n");
      int x = input.nextInt();
      switch (x) {
         case 1:
            System.out.println("Enter length,breadth,height respectively:\n");
            double l1 = input.nextDouble();
            double b = input.nextDouble();
            double h1 = input.nextDouble();
            Box b1 = new Box(l1, b, h1);
            b1.wholeSurfaceArea();
            b1.volume();
            break;
         case 2:
            System.out.println("Enter length:\n");
            double l2 = input.nextDouble();
            Cube c1 = new Cube(l2);
            c1.wholeSurfaceArea();
            c1.volume();
            break;
         case 3:
            System.out.println("Enter radius,height respectively:\n");
            double r1 = input.nextDouble();
            double h2 = input.nextDouble();
            Cylinder c2 = new Cylinder(r1, h2);
            c2.wholeSurfaceArea();
            c2.volume();
            break;
         case 4:
            System.out.println("Enter radius,height respectively:\n");
            double r2 = input.nextDouble();
            double h3 = input.nextDouble();
            Cone c3 = new Cone(r2, h3);
            c3.wholeSurfaceArea();
            c3.volume();
            break;
         default:
            System.out.println("Invalid Choice");
            break;
      }
   }
}
