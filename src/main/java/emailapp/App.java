package emailapp;

public class App {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        System.out.println(emailService.generatePassword());
    }
}
