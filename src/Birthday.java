// Birthday.java
// Birthday class.

public class Birthday {
    private int day;
    private int month;
    private int year;

    // Checks if the given day is valid
    private void isValidDay(int day, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 1 || day > 31) {
                    throw new IllegalArgumentException(
                            "Day of birth must be between 1 and 31 for the given month: " + month);
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day < 1 || day > 30) {
                    throw new IllegalArgumentException(
                            "Day of birth must be between 1 and 30 for the given month: " + month);
                }
                break;
            case 2:
                if (day < 1 || day > 28) {
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

    // set the day of birth
    public void setDay(int day) {
        isValidDay(day, this.month); // validate day
        this.day = day;
    }

    // return the day of birth
    public int getDay() {return day;}

    // set the month of birth
    public void setMonth(int month) {
        if (month < 1 || month > 12) { // validate month
            throw new IllegalArgumentException(
                "Month of birth must be >= 1 and <= 12");
        }

        this.month = month;
    }

    // return the month of birth
    public int getMonth() {return month;}

    // set the year of birth
    public void setYear(int year) {
        if (year < 0 || year > 2025) { // validate year
            throw new IllegalArgumentException(
                "Hours worked must be >= 0 and <= 2025");
        }

        this.year = year;
    }

    // return the year of birth
    public int getYear() {return year;}

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d",
            getDay(), getMonth(), getYear());
    }
}
