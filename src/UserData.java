import java.time.LocalDate;


public class UserData {

    private String lastName;
    private String firstName;
    private String middleName;
    private int phoneNumber;


    public UserData(String lastName, String firstName, String middleName,
                    int phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;

    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }


    public long getPhoneNumber() {
        return phoneNumber;
    }


}