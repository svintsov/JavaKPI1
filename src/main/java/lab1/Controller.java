package lab1;

import java.util.Scanner;

/**
 * Created by bazyl on 2/16/17.
 */
public class Controller {


    // Constructor
    Model model;
    View view;

    public static final int COEFFICIENT_COUNTER = 3;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);

        model.setCoefValue(getCoefStorage(scanner));
        view.printMessage(View.RESULT + model.getResult());

    }

    private double[] getCoefStorage(Scanner scanner) {
        double[] coefsStorage = new double[COEFFICIENT_COUNTER];
        for (int i = 0; i < COEFFICIENT_COUNTER; i++) {
            coefsStorage[i] = getCoefFromScanner(scanner);
        }
        return coefsStorage;
    }

    private double getCoefFromScanner(Scanner scanner) {
        view.printMessage(View.INPUT_DOUBLE);
        while (!scanner.hasNextDouble()) {
            view.printMessage(View.WRONG_INPUT + View.INPUT_DOUBLE);
            scanner.next();
        }
        return scanner.nextDouble();
    }

}
