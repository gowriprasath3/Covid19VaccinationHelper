package com.kumaran.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kumaran.bean.VaccinationCenter;
import com.kumaran.exceptions.CenterNotFoundException;
import com.kumaran.repositories.VaccinationCenterDao;


@Service
public class VaccinationCenterServiceImpl implements VaccinationCenterService{

	@Autowired
	private VaccinationCenterDao vaccinationcenterDao;
	
	@Override
	public VaccinationCenter addVaccinationCente(VaccinationCenter vaccinationCenter) {
		
		return vaccinationcenterDao.save(vaccinationCenter);
	}

	@Override
	public List<VaccinationCenter> listVaccinationCenter() {
		List<VaccinationCenter> centerList= vaccinationcenterDao.findAll();
		return centerList;
	}

	@Override
	public List<VaccinationCenter> getVaccinationCenterByCityName(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinationCenter  getVaccinationCenterById(int centerId) {
//		return vaccinationcenterDao.findById(centerId).orElseThrow(() ->new CenterNotFoundException("Center not found with Id "+centerId) );
		
		return null;
	}
	
		
	
	

}
