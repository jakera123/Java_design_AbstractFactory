package com.zxp.design.client;

import com.zxp.design.abstractproduct.IDapartment;
import com.zxp.design.abstractproduct.IUser;
import com.zxp.design.concretefactory.OracleFactory;
import com.zxp.design.concretefactory.SQLServerFactory;


//不同的工厂产生用不同的方法生产出同样的产品！

public class AbstactFactoryClient {
	public static void main(String[] args){
		
		System.out.println("Welcome to operate Databases!"+"\n"+"Abstract Factory Pattens."+"\n"+"----------------");
		
		IUser oracleUser,sqlUser;
		IDapartment oracleDept,sqlDept;
		OracleFactory of=new OracleFactory();
		SQLServerFactory sf=new SQLServerFactory();
		
		
		oracleUser=of.createUser();
		oracleDept=of.createDeppartment();
		sqlUser=sf.createUser();
		sqlDept=sf.createDeppartment();
		
		
	}
	

}
