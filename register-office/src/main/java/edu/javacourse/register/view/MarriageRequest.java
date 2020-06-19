package edu.javacourse.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable {
    private String husbandSurname;
    private String husbandGivenname;
    private String husbandPatronymic;
    private LocalDate husbandDateOfBirth;
    private String husbandPassportSerial;
    private String husbandPassportNumber;
    private LocalDate husbandPassportIssueDate;
    private String Surname;
    private String wifeGivenname;
    private String wifePatronymic;
    private LocalDate wifeDateOfBirth;
    private String wifePassportSerial;
    private String wifePassportNumber;
    private LocalDate wifePassportIssueDate;

    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDate;

}
