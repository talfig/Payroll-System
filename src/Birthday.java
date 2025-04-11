// Birthday.java
// Birthday class.

public class Birthday {
    private final int day;
    private final int month;
    private final int year;

    // constants for the months
    private static final int
        JANUARY = 1, FEBRUARY = 2, MARCH = 3, APRIL = 4,
        MAY = 5, JUNE = 6, JULY = 7, AUGUST = 8,
        SEPTEMBER = 9, OCTOBER = 10, NOVEMBER = 11, DECEMBER = 12;

    // Checks if the given day is valid
    private void isValidDay(int day, int month) {
        switch (month) {
            case JANUARY: case MARCH: case MAY: case JULY: case AUGUST: case OCTOBER: case DECEMBER:
                if (day < 1 || day > 31) { // validate
                    throw new IllegalArgumentException(
                            "Day of birth must be between 1 and 31 for the given month: " + month);
                }
                break;
            case APRIL: case JUNE: case SEPTEMBER: case NOVEMBER:
                if (day < 1 || day > 30) { // validate
                    throw new IllegalArgumentException(
                            "Day of birth must be between 1 and 30 for the given month: " + month);
                }
                break;
            case FEBRUARY:
                if (day < 1 || day > 28) { // validate
                    throw new IllegalArgumentException(
                            "Day of birth must be between 1 and 28 for the given month: " + month);
                }
                break;
            default:
                throw new IllegalArgumentException(
                        "Day of birth must be >= 1 and <= 31");
        }
    }

    // constructor
    public Birthday(int day, int month, int year) {
        isValidDay(day, month); // validate day

        if (month < 1 || month > 12) { // validate month
            throw new IllegalArgumentException(
                "Month of birth must be >= 1 and <= 12");
        }

        if (year < 0 || year > 2025) { // validate year
            throw new IllegalArgumentException(
                "Hours worked must be >= 0 and <= 2025");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    // return the day of birth
    public int getDay() {return day;}

    // return the month of birth
    public int getMonth() {return month;}

    // return the year of birth
    public int getYear() {return year;}

    // return String representation of Birthday object
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d",
            getDay(), getMonth(), getYear());
    }
}
