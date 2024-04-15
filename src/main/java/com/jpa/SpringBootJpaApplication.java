package com.jpa;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("Priyanshi");
		user.setCity("Up");
		user.setStatus("College");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
	
		
/*		
		// Insert Operation
		// Create object of User
		User user1 = new User();
		user1.setName("Darsh");
		user1.setCity("Agra");
		user1.setStatus("Student");
		
		User user2 = new User();
		user2.setName("Priyanshi");
		user2.setCity("Mathura");
		user2.setStatus("Python Programmmer");
		
		
		// Saving Single User
//		User resultUser = userRepository.save(user2);
//		System.out.println("Saved User: "+resultUser);
//		System.out.println("Done");
		
		// Saving Multiple Users
		List<User> users = List.of(user1,user2);
		Iterable<User> result = userRepository.saveAll(users);
		result.forEach(user ->{
			System.out.println("Saved User:" + user);
		});
*/		
	
		
	
/*		
		// Update Operation
		Optional<User> optional = userRepository.findById(52);    //Optional class deal with situations where a value may or may not be present. 
		User user = optional.get();
		user.setName("Darsh Garg");
		User result = userRepository.save(user);
		System.out.println(result);
*/
		

/*
		// Retrieval of Data
		Optional<User> optional = userRepository.findById(52);    //Optional class deal with situations where a value may or may not be present. 
		User user = optional.get();
		
		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext())
//		{
//			User user1 = iterator.next();
//			System.out.println(user1);
//		}
		itr.forEach(user1 -> {System.out.println(user1);});
*/

		
		
/*		
		// Deleting the user element
		userRepository.deleteById(52);
		System.out.println("Deleted");
		
		Iterable<User> allusers = userRepository.findAll();
		allusers.forEach(user -> System.out.println(user));
		userRepository.deleteAll(allusers);
*/	
	
		

/*
		//Custom Finder Methods
//		List<User> users = userRepository.findByName("Muskan Garg");
//		users.forEach(e -> System.out.println(e));
	
		List<User> users = userRepository.findByNameAndCity("Muskan Garg","Delhi");
		users.forEach(e -> System.out.println(e));
		
		// findByNameStartWith(String prefix)
		// findByNameEndingWith(String suffix)
		// findByContaining(String words)
		// findByNameLike(String likePattern)
		// findByAgeLessThan(int age)
		// findByAgeGreaterThanEqual(int age)
		// findByAgeIn(Collection<Integer> ages)
		// findByNameOrderByName(String name)
*/		
		
		
		
		//Using @Query Annotation
		List<User> allUser = userRepository.getAllUser();
		
		allUser.forEach(e ->{
			System.out.println(e);
		});
		System.out.println("--------------------------------------");
		
//		List<User> userByName = userRepository.getUserByName("Darsh");
//		userByName.forEach(e ->{
//			System.out.println(e);
//		});
//		
//	
//		System.out.println("---------------------------------------------");
//		userRepository.getUsers().forEach(e -> System.out.println(e));
	

	
	}

}
