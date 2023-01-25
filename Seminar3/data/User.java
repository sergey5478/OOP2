package Seminar3.data;

public abstract class User {
    protected final String fio;
    protected final Integer yearOfBirth;
    protected final Integer passport;

    protected User(String fio, Integer yearOfBirth, Integer passport) {
        this.fio = fio;
        this.yearOfBirth = yearOfBirth;
        this.passport = passport;

    }

    public String getFio() {
        return fio;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getPassport() {
        return passport;
    }

    @Override
    public abstract String toString();
}
