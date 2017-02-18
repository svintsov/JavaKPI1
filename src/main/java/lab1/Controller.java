package lab1;

import java.util.Scanner;

/**
 * Created by bazyl on 2/16/17.
 */
public class Controller {

    public static final int N = 3;

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        double A = getCoefFromScanner(sc);
        double B = getCoefFromScanner(sc);
        double C = getCoefFromScanner(sc);
        model.setCoefValue(A, B, C);
        view.printMessage(view.RESULT + model.getResult());


    }

    public double getCoefFromScanner(Scanner sc) {
        view.printMessage(view.INPUT_DOUBLE);
        double userInput;
        while (true) {
            try {
                userInput = Double.parseDouble(sc.next());
                break;
            } catch (NumberFormatException ignore) {
                view.printMessage(View.WRONG_INPUT + View.INPUT_DOUBLE);
            }
        }
        return userInput;

    }


}
