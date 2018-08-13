package emailapp;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String generateEmail(Email email){
        return email.getFirstName() + "." + email.getLastName() + "@" + determineDepartment(email.getDepartment()) + "."
                + email.getCompany() + ".com";
    }

    public String generatePassword(){
        return RandomStringUtils.random(100, true, true);
    }

    private String determineDepartment(String department){
        String noDepartment = "";
        if(Department.ACCOUNTING.getDep().equals(department)) {
            return department;
        }
        if(Department.SALES.getDep().equals(department)) {
            return department;
        }
        if(Department.DEVELOPMENT.getDep().equals(department)) {
            return department;
        }
        return noDepartment;
    }
}
