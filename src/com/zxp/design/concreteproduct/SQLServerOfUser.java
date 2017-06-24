package com.zxp.design.concreteproduct;

import com.zxp.design.abstractproduct.IUser;

public class SQLServerOfUser implements IUser{
	public SQLServerOfUser(){
		System.out.println("SQL server工厂：在SQL　Server中操作USer表");
		
	}
	

}
