DROP TABLE IF EXISTS cr_address_person;
DROP TABLE IF EXISTS cr_person;
DROP TABLE IF EXISTS cr_address;
DROP TABLE IF EXISTS cr_district;
DROP TABLE IF EXISTS cr_street;

CREATE TABLE cr_district (
    district_code INTEGER NOT NULL,
    district_name VARCHAR(300),
    PRIMARY KEY (district_code)
);

INSERT INTO cr_district (district_code, district_name)
VALUES (1, 'Выборшский');

CREATE TABLE cr_street (
    street_code INTEGER NOT NULL,
    street_name VARCHAR(300),
    PRIMARY KEY (street_code)
);

INSERT INTO cr_street (street_code, street_name)
VALUES (1, 'Сомольевский проспект');

CREATE TABLE cr_address (
    address_id SERIAL,
    district_code INTEGER NOT NULL,
    street_code INTEGER NOT NULL,
    building VARCHAR(10) NOT NULL,
    extension VARCHAR(10),
    apartment VARCHAR(10),
    PRIMARY KEY (address_id),
    FOREIGN KEY (district_code) REFERENCES cr_district(district_code) ON DELETE RESTRICT,
    FOREIGN KEY (street_code) REFERENCES cr_street(street_code) ON DELETE RESTRICT
);

INSERT INTO cr_address (district_code, street_code, building, extension, apartment)
VALUES (1, 1, '10', '2', '121');
INSERT INTO cr_address (district_code, street_code, building, extension, apartment)
VALUES (1, 1, '271', null, 4);

CREATE TABLE cr_person (
    person_id SERIAL,
    sur_name VARCHAR(100) NOT NULL,
    given_name VARCHAR(100) NOT NULL,
    patronymic VARCHAR(100) NOT NULL,
    date_of_birth DATE NOT NULL,
    passport_seria VARCHAR(10),
    passport_number VARCHAR(10),
    passport_date DATE,
    certificate_number VARCHAR(10),
    certificate_date DATE,
    PRIMARY KEY (person_id)
);

INSERT INTO cr_person (sur_name, given_name, patronymic, date_of_birth,
passport_seria, passport_number, passport_date, certificate_number, certificate_date)
VALUES ('Васильев', 'Павел', 'Николаевич', '1995-03-18',
'1234', '123456', '2015-04-11', null, null);
INSERT INTO cr_person (sur_name, given_name, patronymic, date_of_birth,
passport_seria, passport_number, passport_date, certificate_number, certificate_date)
VALUES ('Васильева', 'Ирина', 'Петровна', '1997-08-21',
'4321', '654321', '2017-09-19', null, null);
INSERT INTO cr_person (sur_name, given_name, patronymic, date_of_birth,
passport_seria, passport_number, passport_date, certificate_number, certificate_date)
VALUES ('Васильева', 'Евгения', 'Павловна', '2016-01-11',
null, null, null, '456123', '2016-01-16');
INSERT INTO cr_person (sur_name, given_name, patronymic, date_of_birth,
passport_seria, passport_number, passport_date, certificate_number, certificate_date)
VALUES ('Васильев', 'Александр', 'Павлович', '2018-10-24',
null, null, null, '321654', '2018-11-09');

CREATE TABLE cr_address_person (
    person_address_id SERIAL,
    address_id INTEGER NOT NULL,
    person_id INTEGER NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    temporal BOOLEAN DEFAULT false,
    PRIMARY KEY (person_address_id),
    FOREIGN KEY (address_id) REFERENCES cr_address(address_id) ON DELETE RESTRICT,
    FOREIGN KEY (person_id) REFERENCES cr_person(person_id) ON DELETE RESTRICT
);

INSERT INTO cr_address_person (address_id, person_id, start_date, end_date)
VALUES (1, 1, '2014-10-12', null);
INSERT INTO cr_address_person (address_id, person_id, start_date, end_date)
VALUES (1, 2, '2014-10-12', null);
INSERT INTO cr_address_person (address_id, person_id, start_date, end_date)
VALUES (1, 3, '2016-02-05', null);
INSERT INTO cr_address_person (address_id, person_id, start_date, end_date)
VALUES (1, 4, '2018-12-11', null);



