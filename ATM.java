// Encapsulation example

class ATM {
    private int pin;
 
    public void setPin(int pin) {
        this.pin = pin;
    }
 
    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.setPin(1234);

        System.out.println(a.validatePin(1234)); // true
    }
}
