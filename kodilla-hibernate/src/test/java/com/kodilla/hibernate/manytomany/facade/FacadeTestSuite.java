package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import org.junit.jupiter.api.Assertions;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private Facade facade;

    @Test
    void testRetrievingEmployee() throws SearchingException {
        //Given
        Employee janNowak = new Employee("Jan", "Nowak");
        Employee stephanieNowak = new Employee("Stephanie", "Nowak");
        Employee lindaBiden = new Employee("Linda", "Biden");
        Employee peterBiden = new Employee("Peter", "Biden");
        Employee johnPierce = new Employee("John", "Pierce");

        employeeDao.save(janNowak);
        int id1 = janNowak.getId();
        employeeDao.save(stephanieNowak);
        int id2 = stephanieNowak.getId();
        employeeDao.save(lindaBiden);
        int id3 = lindaBiden.getId();
        employeeDao.save(peterBiden);
        int id4 = peterBiden.getId();
        employeeDao.save(johnPierce);
        int id5 = johnPierce.getId();

        //When
        List<Employee> employeeList = facade.getEmployees("den");

        //Then
        try {
            assertEquals(2, employeeList.size());

        } finally {
            //CleanUp
            employeeDao.deleteById(id1);
            employeeDao.deleteById(id2);
            employeeDao.deleteById(id3);
            employeeDao.deleteById(id4);
            employeeDao.deleteById(id5);
        }
    }

    @Test
    void testRetrievingCompany() throws SearchingException {
        //Given
        Company smallCompany = new Company("SmallCompany");
        Company smallerCompany = new Company("SmallerCompany");
        Company fantasticCompany = new Company("FantasticCompany");

        companyDao.save(smallCompany);
        int id1 = smallCompany.getId();
        companyDao.save(smallerCompany);
        int id2 = smallerCompany.getId();
        companyDao.save(fantasticCompany);
        int id3 = fantasticCompany.getId();

        //When
        List<Company> companyList = facade.getCompanies("mall");

        //Then
        try {
            assertEquals(2, companyList.size());

        } finally {
            //CleanUp
            companyDao.deleteById(id1);
            companyDao.deleteById(id2);
            companyDao.deleteById(id3);
        }
    }
}
