package com.data.service;

public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(String userName, String userPass) {
		if(userName.equals("baba") && userPass.equals("twasD"))
		  return true;
		else
			 return false;
		}
	
	public void update()
	{
		System.out.println("UserService Update");
	}

}
