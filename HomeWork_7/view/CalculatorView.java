package HomeWork_7.view;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorView {
    Logger logger = Logger.getLogger(CalculatorView.class.getSimpleName());

    public void printOnConsole(String message){
        logger.log(Level.INFO,message);
    }
}
