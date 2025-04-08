// Birthday.java
// Birthday class.

public class Birthday {
    private int day;
    private int month;
    private int year;

    // constructor
    public Birthday(int day, int month, int year) {
        if (day < 1 || day > 31) { // validate day
            throw new IllegalArgumentException(
                "Day of birth must be >= 1 and <= 31");
        }

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
    public void getDay(int day) {
        if (day < 1 || day > 31) { // validate day
            throw new IllegalArgumentException(
                "Day of birth must be >= 1 and <= 31");
        }

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
