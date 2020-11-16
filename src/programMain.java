import move.MovablePoint;
import subClass.Point3D;
import superClass.Point2D;

public class programMain {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(3.5f, 5.78f);
        System.out.println(point2D);

        Point3D point3D=new Point3D(1,1,5);
        System.out.println(point3D);

        //MovablePoint movablePoint=new MovablePoint(10.2f,5.3f);
        MovablePoint movablePoint= (MovablePoint) point2D;
        System.out.println(movablePoint.getX());
        System.out.println(movablePoint);
    }
    }
