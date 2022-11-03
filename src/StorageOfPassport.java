import java.util.HashSet;
import java.util.Set;

public class StorageOfPassport {
    public Set<String> passports;
    private Passport passport;


    public StorageOfPassport(Set<String> passports) {
        this.passports = passports;
    }

    public void addPassports(Passport passport) {
        Set<String> passports = new HashSet<>();
        if (passport.getPatronymic().isEmpty()) {
            System.out.println(passports.add(String.valueOf(passport)) + " (Отчества нет)");
        } else {
            System.out.println(passports.add(String.valueOf(passport)));
        }
    }

    public String personSearch(String passportNumber) {
        Set<String> passports = new HashSet<>();
        if (!passportNumber.isEmpty()) {
        }
        return passport.getSurName() + passport.getName() + passport.getPatronymic() + passport.getDateOfBirth();
        }
    }

