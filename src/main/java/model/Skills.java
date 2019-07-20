package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Skills {

	@Id
	int skillId;
	
	@Column
	String field;
	
	@Column
	String skill_name;
	
	@Column
	String skill_level;
	
	@ManyToMany(mappedBy="skills")
	List<vacancy> vacancies = new ArrayList<vacancy>();

	public int getSkillId() {
		return skillId;
	}

	public List<vacancy> getVacancies() {
		return vacancies;
	}

	public void setVacancies(List<vacancy> vacancies) {
		this.vacancies = vacancies;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getSkill_name() {
		return skill_name;
	}

	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}

	public String getSkill_level() {
		return skill_level;
	}

	public void setSkill_level(String skill_level) {
		this.skill_level = skill_level;
	}

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
