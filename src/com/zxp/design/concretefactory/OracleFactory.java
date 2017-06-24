package com.zxp.design.concretefactory;

import com.zxp.design.abstractfactory.IDBFactory;
import com.zxp.design.abstractproduct.IDapartment;
import com.zxp.design.abstractproduct.IUser;
import com.zxp.design.concreteproduct.OracleOfDepartment;
import com.zxp.design.concreteproduct.OracleOfUser;

public class OracleFactory implements IDBFactory{

	public IUser createUser() {
		return new OracleOfUser();
	}

	public IDapartment createDeppartment() {
		return new OracleOfDepartment();
	}
	

}
