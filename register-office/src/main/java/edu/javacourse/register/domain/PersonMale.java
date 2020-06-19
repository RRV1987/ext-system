package edu.javacourse.register.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("2")
public class PersonMale extends Person {

//    private List<MarriageCertificate> certificates;
//
//    public List<MarriageCertificate> getCertificates() {
//        return certificates;
//    }
//
//    public void setCertificates(List<MarriageCertificate> certificates) {
//        this.certificates = certificates;
//    }
}
