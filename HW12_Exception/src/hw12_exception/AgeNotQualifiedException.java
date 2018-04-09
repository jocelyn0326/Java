
package hw12_exception;

public class AgeNotQualifiedException extends Exception {

    public AgeNotQualifiedException(String message) {
        Super(message);
    }

    private void Super(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}