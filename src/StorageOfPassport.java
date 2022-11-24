import java.util.List;

public class StorageOfPassport {
    public static List<Passport> passports;


    public StorageOfPassport(List<Passport> passports) {
        this.passports = passports;
    }

    public static void addPassports(Passport passport) {
        if (!passport.getPassportNumber().equals(passports)) {
            passports.add(passport);
        } else {
            System.out.println(passport.getPassportNumber() + passport.getSurName() + passport.getName() +
                    passport.getPatronymic() + passport.getDateOfBirth());
        }
    }


    public static Passport personSearch(Passport passportNumber) {
        for (Passport passport : passports) {
            if (passport.getPassportNumber().equals(passports)) {
                return passport;
            }
        }
        return null;
    }
}

