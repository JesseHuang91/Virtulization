package com.hyj.action;

import com.hyj.model.UserBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login2 extends ActionSupport implements ModelDriven{

	private UserBean user1=new UserBean();

	public UserBean getUser1() {
		return user1;
	}

	public void setUser1(UserBean user1) {
		this.user1 = user1;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return this.SUCCESS;
	}

	@Override
	public UserBean getModel() {
		// TODO Auto-generated method stub
		return this.user1;
	}
	
	
}
