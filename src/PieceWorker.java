// PieceWorker.java
// PieceWorker concrete class extends abstract class Employee.

public class PieceWorker extends Employee {
    private int quantity; // quantity of pieces
    private double cost; // cost per piece

    // constructor
    public PieceWorker(String firstName, String lastName,
                          String socialSecurityNumber, Birthday birthday,
                          int quantity, double cost) {
        super(firstName, lastName, socialSecurityNumber, birthday);

        if (quantity < 0) { // validate quantity
            throw new IllegalArgumentException(
                    "Quantity of pieces must be >= 0");
        }

        if (cost < 0.0) { // validate cost
            throw new IllegalArgumentException(
                    "Cost per piece must be >= 0.0");
        }

        this.quantity = quantity;
        this.cost = cost;
    }
    // set quantity of pieces
    public void setQuantity(int quantity) {
        if (quantity < 0) { // validate quantity
            throw new IllegalArgumentException(
                    "Quantity of pieces must be >= 0");
        }

        this.quantity = quantity;
    }

    // return quantity of pieces
    public int getQuantity() {return quantity;}

    // set cost per piece
    public void setCost(double cost) {
        if (cost < 0.0) { // validate cost
            throw new IllegalArgumentException(
                    "Cost per piece must be >= 0.0");
        }

        this.cost = cost;
    }

    // return cost per piece
    public double getCost() {return cost;}

    // calculate earnings: override abstract method earnings in Employee
    @Override
    public double earnings() {
        return getQuantity() * getCost() + (super.hasBirthdayThisMonth() ? 200.0 : 0.0);
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("piece employee: %s%n%s: %d; %s: %,.2f",
                super.toString(), "quantity of pieces", getQuantity(),
                "cost per piece", getCost());
    }
}
