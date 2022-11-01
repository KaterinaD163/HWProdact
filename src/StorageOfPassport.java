import java.util.HashSet;
import java.util.Set;

public class StorageOfPassport extends Passport {

    public Set<Passport> passports;


    public StorageOfPassport(String passportNumber, String surName, String name, String patronymic, String dateOfBirth, Set<Passport> passports) {
        super(passportNumber, surName, name, patronymic, dateOfBirth);
        this.passports = passports;
    }

    public void addPassports() {
        Set<Passport> passports = new HashSet<>();
        if (getPatronymic().isEmpty()) {
            System.out.println(passports.add((Passport) passports) + " (Отчества нет)");
        }
    }

    public void personSearch() {
        Set<Passport> passports = new HashSet<>();
        if (getPassportNumber().equals(getPassportNumber())) {
            System.out.println(getSurName() + getName() + getPatronymic() + getDateOfBirth());
        }
    }
}
