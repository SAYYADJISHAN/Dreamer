package com.bikkadIT.SpringBootJPA.Service;


import java.util.List;

import com.bikkadIT.SpringBootJPA.Model.User;

public interface ServiceI {

	public void saveUser(User user);
	
	public void saveAlluser(List<User> list);
	
	
	public User getuserById(Integer userId);
     
	public List<User> getAllId(List<Integer> list);
	
	public List<User> getAlluser();
	
	public boolean contactExists(Integer id);
	
	public long countRecords();
	
	public void delete(int id);
	
	public void deleteByObject(User user);
	
	public void deleteallByContact(List<Integer> list);
	
	public void deleteAllContacts();
	
	public void UserPagination();
	
	public void SortingUser();
	
	public User getContactByuserAge(int userAge);
	

	public User getContactByUserName(String userName);
	

	public User getContactByUserId(int userId);
	
	public List<User> getAgeGraeterthanorequal(int age);
	
	public List<User> findByAgeLessthan(int Age);
	
	
	
	
	
	
	
	
	

	
	
}
