package Daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.vaccancy_dao;
import model.vacancy;
public class vacancyDAOImpl implements vaccancy_dao{
	HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void createVacancy(vacancy v) {
		// TODO Auto-generated method stub
		
	}

	public void updateVacancy(vacancy v) {
		// TODO Auto-generated method stub
		
	}

	public void viewVacancy(vacancy v) {
		// TODO Auto-generated method stub
		
	}

	public void deleteVacancy(vacancy v) {
		// TODO Auto-generated method stub
		
	}

	public List<vacancy> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addVacancy(vacancy v) {
		// TODO Auto-generated method stub
		
	}

	
}
