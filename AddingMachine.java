/**
 * A class for summations.
 */
public class AddingMachine {
    private int total = 0;
    private String history = "0";
    
    /**
     * Class constructor, no arguments.
     * 
     * @return An AddingMachine object
     */
    public AddingMachine() {
        total = 0;
    }

    /**
     * Returns the total of an AddingMachine.
     * 
     * @return AddingMachine.total
     */
    public int getTotal() {
        return this.total;
    }

    /**
     * Adds a value to an AddingMachine.
     * 
     * @param value the value to be added
     */
    public void add(int value) {
        this.total += value;
        this.history += " + " + value;
        
        return;
    }

    /**
     * Subtracts a value from an AddingMachine.
     * 
     * @param value the value to be subtracted
     */
    public void subtract(int value) {
        this.total -= value;
        this.history += " - " + value;
        
        return;
    }

    /**
     * Displays the operation history of an AddingMachine.
     * 
     * @return A string containing all past operations
     */
    public String toString() {
        return this.history;
    }

    /**
     * Clears the total and history from an AddingMachine.
     */
    public void clear(){
        this.total = 0;
        this.history = "0";
        
        return;
    }
}