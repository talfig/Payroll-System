// Fig. 10.4: Employee.java
// Employee abstract superclass.

import java.util.Calendar;

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Birthday birthday; // employee's birthday

    // constructor
    public Employee(String firstName, String lastName,
        String socialSecurityNumber, Birthday birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthday = birthday;
    }

    // return first name
    public String getFirstName() {return firstName;}

    // return last name
    public String getLastName() {return lastName;}

    // return social security number
    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    // return birthday
    public Birthday getBirthday() {return birthday;}

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%s %s%n%s %s%nsocial security number: %s",
            getFirstName(), getLastName(), "birthday:",
            getBirthday(), getSocialSecurityNumber());

    }

    // abstract class must be overridden by concrete subclass
    public abstract double earnings(); // no implementation here

    // check if the employee has birthday this month
    protected boolean hasBirthdayThisMonth() {
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH) + 1; // Calendar months are 0-based

        if (currentMonth == birthday.getMonth()) {
            System.out.println("Happy Birthday! You received an extra $200 for this month");
            return true;
        }

        return false;
    }
}
