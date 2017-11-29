package com.techcompany.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.techcompany.Model.User;

@Repository
public interface UserDAO {

	public boolean save(User user);

	public boolean update(User user);

	public boolean delete(User user);

	public List<User> userlist();

	public User getByUserId(String uid);

	public boolean validate(String uid, String password);

}
