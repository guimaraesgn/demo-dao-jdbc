package model.dao;

import db.DB;
import model.dao.impl.SellerDaojJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaojJDBC(DB.getConnection());
	}

}
