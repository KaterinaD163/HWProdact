import java.util.List;

public class StorageOfPassport {
    public static List<Passport> passports;


    private StorageOfPassport(List<Passport> passports) {
        this.passports = passports;
    }

    public static void addPassports(Passport passport) {
        if (!passports.contains(passport)) {
            passports.add(passport);
        } else{
            System.out.println(passport);
        }
    }


    public static Passport personSearch(Passport passportNumber) {
        for (Passport passport : passports) {
            if (passport.getPassportNumber().contains(passports.toString())) {
                return passport;
            }
        }
        return null;
    }
}

