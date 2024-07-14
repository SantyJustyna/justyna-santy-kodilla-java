package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.directory.SearchControls;
import java.util.ArrayList;
import java.util.List;

@Service
public class Facade {
    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    public Facade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }
    public List<Employee> getEmployees(String arg) throws SearchingException {
        List<Employee> result = employeeDao.retrieveEmployeesWithPartOfName(arg);
        if (result.isEmpty()) {
            LOGGER.error(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return result;
    }
    public List<Company> getCompanies(String arg) throws SearchingException {
        List<Company> result = companyDao.retrieveCompanyWithPartOfName(arg);
        if (result.isEmpty()) {
            LOGGER.error(SearchingException.ERR_COMPANY_NOT_FOUND);
            throw new SearchingException(SearchingException.ERR_COMPANY_NOT_FOUND);
        }
        return result;
    }
}
