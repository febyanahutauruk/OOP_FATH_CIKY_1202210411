public class calculation implements Runnable {

    double radius;
    double side;
    double area;
    double phi = 3.14;
public void setSquare(double side) {
    double area = side * side;
}
public double getSquare() {
        return area;
}

public void setCircle(double radius) {
    double area = phi*radius*radius;
}
public String getCircle() {
    return area;
}
public void setTrapezoid(double a, double b, double t) {
    double area = (a+b)/2*t;

}
public static int getTrapezoid() {
    return area;
}

@Override
public void run() {
    while (true) {
        calculation();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}