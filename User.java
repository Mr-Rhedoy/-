public class User {
    private String firstName;
    private String surname;
    private String fathersName;
    private String mothersName;
    private String mobileNumber;
    private String dob;
    private int holdingNumber;

    public User(String firstName, String surname, String fathersName, String mothersName,
                String mobileNumber, String dob, int holdingNumber) {
        this.firstName = firstName;
        this.surname = surname;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.mobileNumber = mobileNumber;
        this.dob = dob;
        this.holdingNumber = holdingNumber;
    }

    // Getter methods for each property
    public String getFirstName() { return firstName; }
    public String getSurname() { return surname; }
    public String getFathersName() { return fathersName; }
    public String getMothersName() { return mothersName; }
    public String getMobileNumber() { return mobileNumber; }
    public String getDob() { return dob; }
    public int getHoldingNumber() { return holdingNumber; }
}
