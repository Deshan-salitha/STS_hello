package com.example.demo.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repositaries.*;

@Service
public class UserService {

	@Autowired
	private UserRepo useRepo;

	
	public void createUser(User user) {
	
		useRepo.save(user);	
	}
	
	public List<User> getAllUsers(){
		return useRepo.findAll();
	}
	
	public User findUserbyID(int id) {
		return useRepo.findById(id).get();
	}
	
	public void deleteUser(int id) {
		useRepo.deleteById(id);
	}
	
}
