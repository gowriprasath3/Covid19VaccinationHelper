package com.kumaran.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class VaccinationCenter {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int centerId;
	
	@NotEmpty(message = "This field is mandatory")
	@Size(min=2, max=20,message = "Length of the string must be between 2 and 20")
	private String centerName;
	
	@NotEmpty(message = "This field is mandatory")
	@Size(min=2, max=20, message = "Length of the string must be between 2 and 20")
	private String city;
	
	
	
	@NotNull(message = "This field is mandatory")
	private String pincode;
	
	@NotNull(message = "This field is mandatory")
	private int covaxin;
	
	@NotNull(message = "This field is mandatory")
	private int covishield;
	private int vaccinaterId;
	public VaccinationCenter(int centerId, String centerName, String city,  String pincode, int covaxin, int covishield,
			int vaccinaterId) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.city = city;
		this.pincode = pincode;
		this.covaxin = covaxin;
		this.covishield = covishield;
		this.vaccinaterId = vaccinaterId;
	}
	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCenterId() {
		return centerId;
	}
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public  String getPincode() {
		return pincode;
	}
	public void setPincode( String pincode) {
		this.pincode = pincode;
	}
	public int getCovaxin() {
		return covaxin;
	}
	public void setCovaxin(int covaxin) {
		this.covaxin = covaxin;
	}
	public int getCovishield() {
		return covishield;
	}
	public void setCovishield(int covishield) {
		this.covishield = covishield;
	}
	public int getVaccinaterId() {
		return vaccinaterId;
	}
	public void setVaccinaterId(int vaccinaterId) {
		this.vaccinaterId = vaccinaterId;
	}
	@Override
	public String toString() {
		return "VaccinationCenter [centerId=" + centerId + ", centerName=" + centerName + ", city=" + city
				+ ", pincode=" + pincode + ", covaxin=" + covaxin + ", covishield=" + covishield + ", vaccinatorId="
				+ vaccinaterId + "]";
	}
	
	

}