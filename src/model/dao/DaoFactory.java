package model.dao;

import model.dao.impl.SellerDaojJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaojJDBC();
	}

}
