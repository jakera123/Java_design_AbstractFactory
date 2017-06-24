package com.zxp.design.concreteproduct;

import com.zxp.design.abstractproduct.IUser;

public class OracleOfUser implements IUser{
	
	public OracleOfUser(){
		System.out.println("Oracle工厂：在Oracle中操作User表");
	}

}
