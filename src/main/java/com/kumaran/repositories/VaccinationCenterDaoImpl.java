package com.kumaran.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.kumaran.bean.VaccinationCenter;


import DbUtil.DbUtil;

public class VaccinationCenterDaoImpl implements VaccinationCenterDao{

	@Override
	public String addVaccinationCente(VaccinationCenter vaccinationCenter) {
		
		java.sql.Connection conn= DbUtil.getConnection();
		
		System.out.println("Connection "+ conn);
		
		String result=" ";
		
		try {
			java.sql.PreparedStatement ps= conn.prepareStatement("insert into vaccinationcenter values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, vaccinationCenter.getCenterId());
		    ps.setString(2, vaccinationCenter.getCenterName());
		    ps.setString(3, vaccinationCenter.getCity());
		    ps.setString(4, vaccinationCenter.getPincode());
		    ps.setInt(5, vaccinationCenter.getCovaxin());
		    ps.setInt(6, vaccinationCenter.getCovishield());
		    ps.setInt(7, vaccinationCenter.getVaccinaterId());
		    
		    int x=ps.executeUpdate();
		    
		    if(x>0) {
		    	result= "vaccinationcenter added successfully!!!";
		    }else {
		    	result ="Couldn,t add center";
		    }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
		
		
		
		
		
	}

	@Override
	public List<VaccinationCenter> listVaccinationCenter() {
		
		
		Connection conn= DbUtil.getConnection();
		
		   List<VaccinationCenter> CenterList= new ArrayList<>();
		   
				PreparedStatement ps;
				try {
					ps = conn.prepareStatement("select * from Vaccinationcenter");
			   
				ResultSet rs =ps.executeQuery();
				
				while(rs.next()) {
					VaccinationCenter vacc=new VaccinationCenter();
					
					vacc.setCenterId(rs.getInt("centerId"));
					vacc.setCenterName(rs.getString("centerName"));
					vacc.setCity(rs.getString("city"));
					vacc.setPincode(rs.getString("pincode"));
					vacc.setCovaxin(rs.getInt("covaxin"));
					vacc.setCovishield(rs.getInt("covishield"));
					vacc.setVaccinaterId(rs.getInt("vaccinaterId"));
					
					CenterList.add(vacc);
				}
				
				}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
		   
		   return CenterList;
		
		
	}

	@Override
	public List<VaccinationCenter> getVaccinationCenterByCityName(String city) {
		
		java.sql.Connection conn= DbUtil.getConnection();
		
		ArrayList<VaccinationCenter> centerList= new ArrayList<VaccinationCenter>();
		
		
		java.sql.PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from vaccinationCenter where city=?");
			ps.setString(1, city);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				VaccinationCenter vc= new VaccinationCenter();
				
				vc.setCenterId(rs.getInt("centerId"));
				vc.setCenterName(rs.getString("centerName"));
				vc.setCity(rs.getString("city"));
				vc.setPincode(rs.getString("pincode"));
				vc.setCovaxin(rs.getInt("covaxin"));
				vc.setCovishield(rs.getInt("covishield"));
				vc.setVaccinaterId(rs.getInt("vaccinaterId"));
				
				centerList.add(vc);
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return centerList;
	}

	@Override
	public List<VaccinationCenter> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VaccinationCenter> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VaccinationCenter> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends VaccinationCenter> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<VaccinationCenter> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VaccinationCenter getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccinationCenter getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<VaccinationCenter> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<VaccinationCenter> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(VaccinationCenter entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends VaccinationCenter> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends VaccinationCenter> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends VaccinationCenter> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends VaccinationCenter> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
