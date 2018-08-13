package emailapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    private EmailService emailService = new EmailService();

    @Test
    public void testGeneratingEmailAccountingDep() {
        Email email = new Email();
        email.setFirstName("ahmed");
        email.setLastName("aziz");
        email.setDepartment("accounting");
        email.setCompany("ing");

        final String expectedEmail = "ahmed.aziz@accounting.ing.com";
        String generatedEmail = emailService.generateEmail(email);
        assertEquals(expectedEmail, generatedEmail);
    }

    @Test
    public void testGeneratingEmailSalesDep() {
        Email email = new Email();
        email.setFirstName("ahmed");
        email.setLastName("aziz");
        email.setDepartment("sales");
        email.setCompany("ing");

        final String expectedEmail = "ahmed.aziz@sales.ing.com";
        String generatedEmail = emailService.generateEmail(email);
        assertEquals(expectedEmail, generatedEmail);
    }

    @Test
    public void testGeneratingEmailDevDep() {
        Email email = new Email();
        email.setFirstName("ahmed");
        email.setLastName("aziz");
        email.setDepartment("development");
        email.setCompany("ing");

        final String expectedEmail = "ahmed.aziz@development.ing.com";
        String generatedEmail = emailService.generateEmail(email);
        assertEquals(expectedEmail, generatedEmail);
    }

    @Test
    public void testGeneratingEmailNoDep() {
        Email email = new Email();
        email.setFirstName("ahmed");
        email.setLastName("aziz");
        email.setDepartment("some dep");
        email.setCompany("ing");

        final String expectedEmail = "ahmed.aziz@.ing.com";
        String generatedEmail = emailService.generateEmail(email);
        assertEquals(expectedEmail, generatedEmail);
    }

}
