package lab1;

/**
 * Created by bazyl on 2/16/17.
 */
public class Model {

    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    private static final int INDEX_A = 0;
    private static final int INDEX_B = 1;
    private static final int INDEX_C = 2;


    public void setCoefValue(double[] coefStorage) {
        coefficientA = coefStorage[INDEX_A];
        coefficientB = coefStorage[INDEX_B];
        coefficientC = coefStorage[INDEX_C];
    }

    public void setCoefValue(double A, double B, double C) {
        coefficientA = A;
        coefficientB = B;
        coefficientC = C;
    }

    private double getDeterminant() {
        return coefficientB * coefficientB - 4 * coefficientA * coefficientC;
    }

    public boolean getResult() {
        double determinant = getDeterminant();
        boolean result = false;
        if (determinant > 0) {
            result = isFirstCaseRootsIntegers(determinant);
        }
        if (determinant == 0) {
            result = isSecondCaseRootInteger();
        }
        return result;
    }

    private boolean isFirstCaseRootsIntegers(double determinant) {
        double rootOne = (-1 * coefficientB + Math.sqrt(determinant)) / (2 * coefficientA);
        double rootTwo = (-1 * coefficientB - Math.sqrt(determinant)) / (2 * coefficientA);

        return (rootOne % 1 == 0) && (rootTwo % 1 == 0);
    }

    private boolean isSecondCaseRootInteger() {
        double root = -1 * coefficientB / 2 * coefficientA;
        return root % 1 == 0;
    }


}
