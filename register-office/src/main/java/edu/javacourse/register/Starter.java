package edu.javacourse.register;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.rest.MarriageController;
import edu.javacourse.register.view.MarriageRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"springContext.xml"}
        );
        //MarriageController controller = context.getBean(MarriageController.class);
//        MarriageController controller = context.getBean("controller", MarriageController.class);
//        MarriageRequest request = new MarriageRequest();
//        request.setMarriageCertificateNumber("152 Marriage");
//        request.setMarriageCertificateDate(LocalDate.of(2017,9,3));
//        request.setHusbandSurname("Васильев");
//        request.setHusbandGivenname("Олег");
//        request.setHusbandPatronymic("Петрович");
//        request.setHusbandDateOfBirth(LocalDate.of(1997,10,16));
//        request.setWifeSurname("Васильева");
//        request.setWifeGivenname("Елена");
//        request.setWifePatronymic("Сергеевна");
//        request.setWifeDateOfBirth(LocalDate.of(1998,3,24));
//        controller.findMarriageCertificate(request);
    }
}
