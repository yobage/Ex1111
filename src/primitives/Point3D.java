package primitives;

import java.util.Objects;

import static primitives.Util.*;

/**
 *
 * /לסדר  תיעוד
 *
 */
public class Point3D {
    Coordinate x;
    Coordinate y;
    Coordinate z;

    public Point3D(Coordinate X,Coordinate Y,Coordinate Z){
    x=X;
    y=Y;
    z=Z;
    }
    public Point3D(Point3D A){
        x=A.x;
        y=A.y;
        z=A.z;
    }
    public  Point3D get(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point3D)) return false;
        Point3D point3D = (Point3D) o;
        return x.equals(point3D.x) &&
                y.equals(point3D.y) &&
                z.equals(point3D.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Point3D{" +

                "x=" + x.toString() +
                ", y=" + y.toString() +
                ", z=" + z.toString() +
                '}';
    }
};


