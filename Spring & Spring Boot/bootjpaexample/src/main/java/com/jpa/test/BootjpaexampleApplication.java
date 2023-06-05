package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.entities.User;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
		SpringApplication.run(BootjpaexampleApplication.class, args);
		
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		/*
		User user = new User();
		user.setName("Muskan Jain");
		user.setCity("Deljo");
		user.setStatus("I am java programmer"); 
		
		
		User user1 = userRepository.save(user);
		
		System.out.println(user1);
		
		
		//Create Object of user
		User user1 = new User();
		user1.setName("Cheenu");
		user1.setCity("Vidisha");
		user1.setStatus("C++ Programmer");
		
		User user2 = new User();
		user2.setName("Cheenu jain");
		user2.setCity("Vidisha bhopal");
		user2.setStatus("C++ Programmer hu");
		
		
		//saving single user
		//User resultUser = userRepository.save(user2);
		//System.out.println("saved user" + resultUser);
		
		List<User> users = List.of(user1, user2);
		Iterable < User> result = userRepository.saveAll(users);
		
		result.forEach(user->{
			System.out.println(user);
		});
		
		
		//update the user of id 52
		Optional<User> optional =  userRepository.findById(52);
		User user = optional.get();
		user.setName("Rv");
		User result = userRepository.save(user);
		 
		System.out.println(result);*/
		
		
		//how to get the data
		//findById(id) - return Optional Containing your data
	//	Iterable <User> itr = userRepository.findAll();
		
		//1st way
	//	Iterator<User> iterator = itr.iterator();
	//	while(iterator.hasNext()) {
	//		User user = iterator.next();
	//		System.out.println(user);
	//	}
		
		//2nd way
	//	itr.forEach(new Consumer<User>() {
//
	//		@Override
		//	public void accept(User t) {
			//	// TODO Auto-generated method stub
			//	System.out.println(t);
		//	}
			
	//	});
				
		//easiest third way
		//		itr.forEach(user->{System.out.println(user);});
				
				
				
				
		//deleting the user element
				//userRepository.deleteById(11);
				//System.out.println("deleted");
		
		
		//Iterable < User> allusers = userRepository.findAll();
		//allusers.forEach(user->System.out.println(user));
		//userRepository.deleteAll(allusers);
		
		
		//List < User> users = userRepository.findByName("Muskan Jain");
		//users.forEach(e->System.out.println(e));
		
		List < User> users = userRepository.findByNameAndCity("Muskan Jain", "Deljo");
		users.forEach(e->System.out.println(e));
		
		
;	}

}






















