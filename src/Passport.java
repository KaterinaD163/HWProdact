import java.util.Map;

public class Passport {


    private static String passportNumber;
    public static String surName;
    private static String name;
    private static String patronymic;
    private static String dateOfBirth;

    Map<Integer, Passport> map;


    public static String getPassportNumber() {
        return passportNumber;
    }

    public static String getSurName() {
        return surName;
    }

    public static String getName() {
        return name;
    }

    public static String getPatronymic() {
        return patronymic;
    }

    public static String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "map=" + map +
                '}';
    }

    public Passport(String passportNumber, String surName, String name, String patronymic, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;

    }


//    public static void savePerson() {
//        HashMap<String, String[]> map = new HashMap<>();
//        if (!passportNumber.isEmpty()) {
//            map.put();
//
//        }
}

