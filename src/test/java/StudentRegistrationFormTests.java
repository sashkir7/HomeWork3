import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import studentRegistrationForm.StudentRegistrationFormPage;
import studentRegistrationForm.StudentRegistrationFormViewModel;
import studentRegistrationForm.StudentRegistrationFormViewModelBuilder;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @BeforeEach
    void beforeEach() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    void checkRegisterForm() {
        // Arange
        var page = new StudentRegistrationFormPage();
        var formViewModel = StudentRegistrationFormViewModelBuilder.getRandomViewModel();

        // Act
        page.fillForm(formViewModel);

        // Assert
        var checkForm = $(".table-responsive");
        checkForm.shouldHave(
                text(formViewModel.firstName),
                text(formViewModel.lastName),
                text(formViewModel.email),
                text(formViewModel.sex.getValue()),
                text(formViewModel.phoneNumber),
                text(formViewModel.currentAddress),
                text(formViewModel.state),
                text(formViewModel.currentAddress),
                text("22 November,1997"));
        for (var subject:formViewModel.subjects)
            checkForm.shouldHave(text(subject));
        for (var hobby:formViewModel.hobbies)
            checkForm.shouldHave(text(hobby.getValue()));
    }
}