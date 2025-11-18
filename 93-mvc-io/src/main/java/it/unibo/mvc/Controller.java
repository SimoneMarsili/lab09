package it.unibo.mvc;

import java.util.List;

/**
 * Models a controller responsible of I/O access.
 */
public interface Controller {
    /**
     * Sets the next string to be printed.
     * 
     * @param s the string to be set
     */
    void setNextString(String s);

    /**
     * Provides the next string to be printed.
     * 
     * @return the next string to be printed
     */
    String getNextString();

    /**
     * Provides the whole history of printed strings.
     * 
     * @return a list containing the string history
     */
    List<String> getHistory();

    /**
     * Shows the string to be printed on standard output.
     */
    void printString();
}
