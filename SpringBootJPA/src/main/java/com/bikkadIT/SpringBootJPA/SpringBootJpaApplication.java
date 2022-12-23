package com.bikkadIT.SpringBootJPA;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikkadIT.SpringBootJPA.Model.User;
import com.bikkadIT.SpringBootJPA.Service.ServiceImpl;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		
		ServiceImpl bean =context.getBean(ServiceImpl.class);
	User user = new User();
		user.setUserId(1);
		user.setUserName("Tausif");
		user.setUserAge(28);
		user.setPassword(88677);
 		user.setUseraddress("sondo");
		
	
		User user1 = new User();
		user1.setUserId(2);
		user1.setUserName("Furkhan");
       user1.setUserAge(25);
       user1.setPassword(1234567);
		user1.setUseraddress("Warur");
		
		

	User user2 = new User();
		user2.setUserId(3);
		user2.setUserName("Faizan");
		user2.setUserAge(27);
		user2.setPassword(18889);
 		user2.setUseraddress("Dewada");
	
		

	User user3 = new User();
		user3.setUserId(4);
		user3.setUserName("Shubham");
 		user3.setUserAge(30);
 		user3.setPassword(1768789);
 		user3.setUseraddress("Lakkadkot");
 		
 	User user4=new User();
 		user4.setUserId(5);
 		user4.setUserName("Zeeshan");
 		user4.setUserAge(20);
 		user4.setPassword(1234);
 		user4.setUseraddress("Rajura");
 		
 		User user5=new User();
 		user5.setUserId(6);
 		user5.setUserName("Naved");
 		user5.setUserAge(22);
 		user5.setPassword(12345);
 		user5.setUseraddress("pune");
     		
 		
		
	java.util.List<User> l = new ArrayList<>();
		l.add(user);
		l.add(user1);
		l.add(user2);
		l.add(user3);
		l.add(user4);
		l.add(user5);
		
		System.out.println(l);
		
	bean.saveAlluser(l);
	

		
//		User user=bean.getuserById(1);
//		System.out.println(user);
//		
//		java.util.List<Integer> asList = Arrays.asList(1,2,3);
//		java.util.List<User> allId = bean.getAllId(asList);
//		
//		System.out.println(allId);
//		
//		for( User user:allId) {
//			System.out.println(user);
		
//		java.util.List<User> alluser = bean.getAlluser();
//		
//		System.out.println(alluser);
//		
//		for(User user:alluser) {
//			System.out.println(user);
		
//		boolean contactExists = bean.contactExists(1);
//		System.out.println( contactExists);
//		

//		boolean contactExists = bean.contactExists(10);
//		System.out.println( contactExists);
//		
//		
////			
//		long countRecords = bean.countRecords();
//		System.out.println(countRecords);
//			
//		
	//	bean.delete(6);
		
//		User user=new User();
//		user.setUserId(5);
//		bean.deleteByObject(user);
//		
//			
		
//		java.util.List<Integer> asList = Arrays.asList(3,4);
//		bean.deleteallByContact(asList);
//		
		
//		bean.deleteAllContacts();
		
//		bean.UserPagination();
//		
//		bean.SortingUser();
//		
////		
//		User user = bean.getContactByuserAge(27);
//		System.out.println(user);
		
//		User user = bean.getContactByUserName("Zeeshan");
//		System.out.println(user);
//		
		
//		User user = bean.getContactByUserId(2);
//		System.out.println(user);
		
//		java.util.List<User> list = bean.getAgeGraeterthanorequal(20);
//		System.out.println(list);
//		
	//	java.util.List<User> list = bean.findByAgeLessthan(30);
	//	System.out.println(list);
	}
		
		
}
	


