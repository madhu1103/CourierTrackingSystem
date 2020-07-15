package com.Bo;
import com.Vo.PackageVo;
import com.DAO.*;
public class PackageStatusBo {
public PackageVo trackPackage(PackageVo p)
{
	PackageStatusDao packageStatusDaoObj = new PackageStatusDao();
	return packageStatusDaoObj.trackPackage(p);
}
}
