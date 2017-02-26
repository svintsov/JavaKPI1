package lab1;

import java.util.Scanner;

/**
 * Created by bazyl on 2/16/17.
 */
public class Controller {

    // Constructor
    private final Model model;
    private final View view;

    private static final int COEFFICIENT_COUNTER = 3;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void processUser() {
        final Scanner scanner = new Scanner(System.in);
        model.setCoefValue(getCoefStorage(scanner));
        view.printMessage(View.RESULT + model.getResult());

    }

    private double[] getCoefStorage(final Scanner scanner) {
        final double[] coefsStorage = new double[COEFFICIENT_COUNTER];
        for (int i = 0; i < COEFFICIENT_COUNTER; i++) {
            coefsStorage[i] = getCoefFromScanner(scanner);
        }
        return coefsStorage;
    }

    private double getCoefFromScanner(final Scanner scanner) {
        view.printMessage(View.INPUT_DOUBLE);
        while (!scanner.hasNextDouble()) {
            view.printMessage(View.WRONG_INPUT + View.INPUT_DOUBLE);
            scanner.next();
        }
        return scanner.nextDouble();
    }

}
