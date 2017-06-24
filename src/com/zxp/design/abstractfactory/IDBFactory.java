package com.zxp.design.abstractfactory;

import com.zxp.design.abstractproduct.IDapartment;
import com.zxp.design.abstractproduct.IUser;

public interface IDBFactory {
	
	public IUser createUser();
	public IDapartment createDeppartment();

}
