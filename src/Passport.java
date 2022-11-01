import java.util.Map;

public class Passport {
    private String passportNumber;

    public String getPassportNumber() {
        return passportNumber;
    }

    public String surName;
    private String name;
    private String patronymic;
    private String dateOfBirth;


    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public Passport(String passportNumber, String surName, String name, String patronymic, String dateOfBirth) {
        this.passportNumber = passportNumber;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }
}

