package com.Bo;

import com.DAO.PackageRegistrationDao;
import com.Vo.*;

public class PackageRegistrationBo {
	public Courier registerPackage(Courier c)
	{
		PackageRegistrationDao packageRegistrationDaoObj = new PackageRegistrationDao();
		return packageRegistrationDaoObj.registerPackage(c);
	}
}
