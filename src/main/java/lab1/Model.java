package lab1;

/**
 * Created by bazyl on 2/16/17.
 */
public class Model {

    private double A;
    private double B;
    private double C;


    public void setCoefValue(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    private double getDeterminant() {
        return B * B - 4 * A * C;
    }

    public boolean getResult() {
        double determinant = getDeterminant();
        if (determinant > 0) {
            return checkRoots(determinant);
        } else if (determinant == 0) {
            return checkRoot();
        } else {
            return false;
        }
    }

    private boolean checkRoots(double determinant) {
        double x1 = (-1 * B + Math.sqrt(determinant)) / (2 * A);
        double x2 = (-1 * B - Math.sqrt(determinant)) / (2 * A);

        return (x1 % 1 == 0.0) && (x2 % 1 == 0.0);
    }

    private boolean checkRoot() {
        double x = -1 * B / 2 * A;
        return x % 1 == 0.0;
    }


}
