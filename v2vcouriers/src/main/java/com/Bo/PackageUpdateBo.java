package com.Bo;
import com.Vo.PackageVo;
import com.DAO.PackageUpdateDao;
public class PackageUpdateBo {
	public PackageVo packageUpdate(PackageVo p)
	{
		PackageUpdateDao packageUpdateDaoObj = new PackageUpdateDao();
		return packageUpdateDaoObj.packageUpdate(p);
	}
}
