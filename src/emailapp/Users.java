package emailapp;

import emailapp.User;

public interface Users {

	User findByUsername(String username);
	void insert(User user);
}