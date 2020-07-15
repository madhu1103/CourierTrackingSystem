package com.Bo;

import com.DAO.StaffSignUpDao;
import com.Vo.*;

public class StaffSignUpBo {
	public Courier staffSignUpCheck(Courier c)
	{
		StaffSignUpDao staffSignUpDaoObj = new StaffSignUpDao();
		return staffSignUpDaoObj.staffSignUpCheck(c);
	}
}
