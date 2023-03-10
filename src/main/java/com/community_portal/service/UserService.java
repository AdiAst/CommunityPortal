package com.community_portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.community_portal.entity.User;
import com.community_portal.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository repo;
	 public boolean save(User user) {
		 try {
			 repo.save(user);
			 return true;
		} catch (Exception e) {
			return false;
		}
	 }
	 public List<User> listAll() {
		 return (List<User>) repo.findAll();
	 }
	 public User get(Long id) {
		 return repo.findById(id).get();
	 }
	 public void delete(Long id) {
		 repo.deleteById(id);
	 }
	 public User getByEmail(String keyword) {
		 return repo.getByEmail(keyword);
	 }
	 public String a() {
			String x = "sa";
			return x;
		}
	 
}
