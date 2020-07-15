package com.Bo;
import java.util.List;
import com.DAO.*;
import com.Vo.*;
public class StaffListBo {
public List<Courier> getStaff()
{
	StaffListDao staffListDaoObj = new StaffListDao();
	return staffListDaoObj.getStaff();
}
}
