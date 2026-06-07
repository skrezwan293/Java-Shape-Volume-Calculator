package volumecalculator;

public class volume {

    // rectangle
    public String rectaingle(int l, int w, int h) {
        int Volume = l * w * h;
        return Volume + " m³";
    }

    // prism rectangle
    public String prizomrectaingle(int w, int h) {
        double Volume = 0.5 * w * h;
        return Volume + " m³";
    }

    // cylinder
    public String cylinder(double r, int h) {
        double Volume = r * r * h;
        return Volume + "pi m³";
    }

    // square pyramid
    public String SP(int b, int h) {
        double Volume = (1.0 / 3) * (b*b)* h;
        return Volume + " m³";
    }

    // circle pyramid
    public String CP(int r, int h) {
        double Volume = (1.0 / 3) * r * r * h;
        return Volume + "pi m³";
    }

    // sphere
    public String sphere(double r) {
        double Volume = (4.0 / 3) * r * r * r;
        return Volume + "pi m³";
    }
}