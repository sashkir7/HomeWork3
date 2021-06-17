package studentRegistrationForm;

import com.github.javafaker.Faker;
import enums.Hobby;
import java.util.Locale;

import static enums.Hobby.*;
import static enums.Sex.*;

public class StudentRegistrationFormViewModelBuilder {

    private static Faker faker = new Faker(new Locale("en-CA"));

    public static StudentRegistrationFormViewModel getRandomViewModel() {
        var viewModel = new StudentRegistrationFormViewModel();
        viewModel.firstName = faker.name().firstName();
        viewModel.lastName = faker.name().lastName();
        viewModel.email = faker.internet().emailAddress();
        viewModel.sex = Male;
        viewModel.phoneNumber = faker.phoneNumber().subscriberNumber(10);

        viewModel.dayOfBirth = 22;
        viewModel.monthOfBirth = "November";
        viewModel.yearOfBirth = 1997;
        viewModel.subjects = new String[] {"Physics"};
        viewModel.hobbies = new Hobby[] {Sports, Music};

        viewModel.currentAddress = faker.address().fullAddress();
        viewModel.state = "NCR";
        viewModel.city = "Delhi";

        return viewModel;
    }
}
