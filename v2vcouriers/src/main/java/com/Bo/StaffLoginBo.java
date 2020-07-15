package com.Bo;

import com.DAO.StaffLoginDao;
import com.Vo.*;

public class StaffLoginBo {
	public Courier loginCheck(Courier c)
	{
		StaffLoginDao staffLoginDaoObj = new StaffLoginDao();
		return staffLoginDaoObj.loginCheck(c);
	}
	
}
