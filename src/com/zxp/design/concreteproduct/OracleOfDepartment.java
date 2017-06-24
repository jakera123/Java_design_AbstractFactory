package com.zxp.design.concreteproduct;

import com.zxp.design.abstractproduct.IDapartment;

public class OracleOfDepartment implements IDapartment{
	
	public OracleOfDepartment(){
		System.out.println("Oracle工厂：在Oracle中操作Department表");
	}

}
