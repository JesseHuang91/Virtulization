123
package com.hyj.action;

import com.hyj.model.UserBean;
import com.opensymphony.xwork2.ActionSupport;

public class Login1 extends ActionSupport {

	private UserBean user1;

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
	
}
