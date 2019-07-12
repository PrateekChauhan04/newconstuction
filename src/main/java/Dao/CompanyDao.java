package Dao;

import java.util.List;

import model.Company;
import model.vacancy;

public interface CompanyDao {

public void createCompany(Company c);
public void  updateCompany(Company c );
public void deleteCompany(Company c);
	
	
public List<Company> readAll();

}