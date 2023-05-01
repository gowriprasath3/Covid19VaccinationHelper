package com.kumaran.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumaran.bean.VaccinationCenter;

public interface VaccinationCenterDao extends JpaRepository<VaccinationCenter, Integer> {
	
	public String addVaccinationCente(VaccinationCenter vaccinationCenter);
	
	public List<VaccinationCenter> listVaccinationCenter();
	
	public List<VaccinationCenter> getVaccinationCenterByCityName(String city);
	

}
