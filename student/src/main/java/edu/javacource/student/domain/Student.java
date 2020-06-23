package edu.javacource.student.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name="sr_student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "midle_name")
    private String midle_name;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "passport_seria")
    private String passportSeria;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "passport_date")
    private LocalDate passportDate;
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY, mappedBy = "student")
    private List<StudentDocument> documents;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidle_name() {
        return midle_name;
    }

    public void setMidle_name(String midle_name) {
        this.midle_name = midle_name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getPassportDate() {
        return passportDate;
    }

    public void setPassportDate(LocalDate passportDate) {
        this.passportDate = passportDate;
    }

    public List<StudentDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<StudentDocument> documents) {
        this.documents = documents;
    }
}
