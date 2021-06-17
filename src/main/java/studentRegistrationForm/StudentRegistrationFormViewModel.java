package studentRegistrationForm;

import enums.Hobby;
import enums.Sex;

public class StudentRegistrationFormViewModel {
    public String firstName;
    public String lastName;
    public String email;
    public Sex sex;
    public String phoneNumber;

    public int dayOfBirth;
    public String monthOfBirth;
    public int yearOfBirth;

    public String[] subjects;
    public Hobby[] hobbies;
    public String currentAddress;
    public String state;
    public String city;
}