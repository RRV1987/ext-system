package edu.javacourse.register.dao;

import edu.javacourse.register.domain.MarriageCertificate;
import edu.javacourse.register.view.MarriageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
public class MarriageDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(MarriageDao.class);

    private EntityManager entityManager;
    @Value("${test.value}")
    private String test;

    public void setTest(String test) {
        this.test = test;
    }

//    public  MarriageDao() {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistance");
//        entityManager = entityManagerFactory.createEntityManager();
//    }

    public MarriageCertificate findMarriageCertificate(MarriageRequest request) {
        LOGGER.info("findMarriageCertificate called:{}", test);
        return null;
//        TypedQuery<MarriageCertificate> query = entityManager.createNamedQuery(
//                "MarriageCertificate.findMarriageCertificates", MarriageCertificate.class);
//        query.setParameter("mcNumber", request.getMarriageCertificateNumber());
//        query.setParameter("mcIssueDate", request.getMarriageCertificateDate());
//        query.setParameter("hFirstName", request.getHusbandGivenname());
//        query.setParameter("hLastName", request.getHusbandSurname());
//        query.setParameter("hPatronymic", request.getHusbandPatronymic());
//        query.setParameter("hDateOfBirth", request.getHusbandDateOfBirth());
//        query.setParameter("wFirstName", request.getWifeGivenname());
//        query.setParameter("wLastName", request.getHusbandSurname());
//        query.setParameter("wPatronymic", request.getWifePatronymic());
//        query.setParameter("w.DateOfBirth", request.getWifeDateOfBirth());
//        return query.getSingleResult();
    }

}
