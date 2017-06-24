package com.zxp.design.concreteproduct;

import com.zxp.design.abstractproduct.IDapartment;

public class SQLServerOfDepartment implements IDapartment{
	public SQLServerOfDepartment(){
		System.out.println("SQL Server工厂：在SQL Server中操作Department表");
	}
}
