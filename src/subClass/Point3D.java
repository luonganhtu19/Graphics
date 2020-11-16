package subClass;

import superClass.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z=0;

    public Point3D(){};
    public Point3D(float x,float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
     setXY(x,y);
     this.z=z;
    }
    public float[] getXYZ(){
        float[] arr3=new float[3];
        arr3[0]=getX();
        arr3[1]=getY();
        arr3[2]=getZ();
        return arr3;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x="+ getX()+
                " y="+getY()+
                " z=" + z +
                " arrXYZ"+ Arrays.toString(getXYZ()) +
                '}';
    }
}
