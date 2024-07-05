package com.jsp.OneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String ceo;

@OneToMany
private List<Employe> employes;
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCeo() {
	return ceo;
}

public void setCeo(String ceo) {
	this.ceo = ceo;
}

public List<Employe> getEmployes() {
	return employes;
}

public void setEmployes(List<Employe> employes) {
	this.employes = employes;
}


}
