package com.zxp.design.concretefactory;

import com.zxp.design.abstractfactory.IDBFactory;
import com.zxp.design.abstractproduct.IDapartment;
import com.zxp.design.abstractproduct.IUser;
import com.zxp.design.concreteproduct.SQLServerOfDepartment;
import com.zxp.design.concreteproduct.SQLServerOfUser;

public class SQLServerFactory implements IDBFactory{

	public IUser createUser() {
		return new SQLServerOfUser();
	}

	public IDapartment createDeppartment() {
		return new SQLServerOfDepartment();
	}

}
