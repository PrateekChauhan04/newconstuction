package Daoimpl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import Dao.candidateDao;
import model.candidate;
import model.education;

import model.experience;

public class candidateDaoImpl implements candidateDao {

	HibernateTemplate hTemplate;
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public void createCandidate(candidate c) {
		// TODO Auto-generated method stub
		
	}

	public void updateCandidate(candidate c) {
		// TODO Auto-generated method stub
		
	}

	public void addExperience(String candidateMobileNo, experience ex) {
		// TODO Auto-generated method stub
		
	}

	public void addEducation(String candidateMobileNo, education ex) {
		// TODO Auto-generated method stub
		
	}

	public void updateExperience(String candidateMobileNo, experience ex) {
		// TODO Auto-generated method stub
		
	}

	public void updateEducation(String candidateMobileNo, education ex) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCandidate(String candidateMobileNo) {
		// TODO Auto-generated method stub
		
	}



}
