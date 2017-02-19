package lab1;

/**
 * Created by bazyl on 2/16/17.
 */
public class Model {

    private double coefficientA;
    private double coefficientB;
    private double coefficientC;


    public void setCoefValue(double A, double B, double C) {
        this.coefficientA = A;
        this.coefficientB = B;
        this.coefficientC = C;
    }

    private double getDeterminant() {
        return coefficientB * coefficientB - 4 * coefficientA * coefficientC;
    }

    public boolean getResult() {
        double determinant = getDeterminant();
        if (determinant > 0) {
            return checkFirstCaseRoots(determinant);
        } else if (determinant == 0) {
            return checkSecondCaseRoot();
        } else {
            return false;
        }
    }

    private boolean checkFirstCaseRoots(double determinant) {
        double rootOne = (-1 * coefficientB + Math.sqrt(determinant)) / (2 * coefficientA);
        double rootTwo = (-1 * coefficientB - Math.sqrt(determinant)) / (2 * coefficientA);

        return (rootOne % 1 == 0) && (rootTwo % 1 == 0);
    }

    private boolean checkSecondCaseRoot() {
        double root = -1 * coefficientB / 2 * coefficientA;
        return root % 1 == 0;
    }


}
