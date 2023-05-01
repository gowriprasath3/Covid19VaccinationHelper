package com.kumaran.services;

import java.util.List;

import com.kumaran.bean.VaccinationCenter;

public interface VaccinationCenterService {
	
    public VaccinationCenter addVaccinationCente(VaccinationCenter vaccinationCenter);
	
	public List<VaccinationCenter> listVaccinationCenter();
	
	public List<VaccinationCenter> getVaccinationCenterByCityName(String city);
	
	public VaccinationCenter getVaccinationCenterById(int centerId);
	
	
	
	

}
