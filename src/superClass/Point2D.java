package superClass;

import java.util.Arrays;

public class Point2D {
    private float x = 0;
    private float y = 0;
    private  float[] arr = new float[2];

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
        getXY();
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float X, float Y) {
        this.x = X;
        this.y = Y;
    }

    public float[] getXY() {
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
