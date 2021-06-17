package studentRegistrationForm;

import enums.Hobby;
import enums.Sex;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StudentRegistrationFormPage {

    private void setFirstName(String firstName) {
        $("#firstName").setValue(firstName);
    }

    private void setLastName(String lastName) {
        $("#lastName").setValue(lastName);
    }

    private void setEmail(String email) {
        $("#userEmail").setValue(email);
    }

    private void setSex(Sex sex) {
        $(byText(sex.getValue())).click();
    }

    private void setPhoneNumber(String phoneNumber) {
        $("#userNumber").setValue(phoneNumber);
    }

    private void setDateOfBirth(int day, String month, int year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(String.valueOf(year));
        $("[aria-label='Choose Saturday, November 22nd, 1997']").click();
    }

    private void setSubjects(String[] subjects) {
        for (var subject : subjects)
            $("#subjectsInput").setValue(subject).pressEnter();
    }

    private void setHobbies(Hobby[] hobbies) {
        for (var hobby : hobbies)
            $(byText(hobby.getValue())).click();
    }

    private void setCurrentAddress(String currentAddress) {
        $("#currentAddress").setValue(currentAddress);
    }

    private void setState(String state) {
        $("#react-select-3-input").setValue(state).pressEnter();
    }

    private void setCity(String city) {
        $("#react-select-4-input").setValue(city).pressEnter();
    }

    private void clickSubmit() {
        $("#submit").click();
    }

    public void fillForm(StudentRegistrationFormViewModel formViewModel) {
        setFirstName(formViewModel.firstName);
        setLastName(formViewModel.lastName);
        setEmail(formViewModel.email);
        setSex(formViewModel.sex);
        setPhoneNumber(formViewModel.phoneNumber);
        setDateOfBirth(formViewModel.dayOfBirth, formViewModel.monthOfBirth, formViewModel.yearOfBirth);
        setSubjects(formViewModel.subjects);
        setHobbies(formViewModel.hobbies);
        setCurrentAddress(formViewModel.currentAddress);
        setState(formViewModel.state);
        setCity(formViewModel.city);

        clickSubmit();
    }
}
