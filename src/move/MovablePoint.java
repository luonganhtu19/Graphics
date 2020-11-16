package move;

import superClass.Point2D;

public class MovablePoint extends Point2D {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(){}
    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
        setXY(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] speed=new float[2];
        speed[0]=xSpeed;
        speed[1]=ySpeed;
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                " ,x= "+getX()+
                " ,y= "+getY()+
                '}';
    }
    public MovablePoint move(){
        float x=getX()+this.xSpeed;
        setX(x);
        setY(getY()+ySpeed);
        System.out.println(getX());
        return this;
    }
}
