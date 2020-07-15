package com.Bo;
import com.Vo.*;
import com.DAO.SignUpDao;
public class SignUpBo {
	public Courier signUpCheck(Courier c)
	{
		SignUpDao signUpDaoObj = new SignUpDao();
		return signUpDaoObj.signUpCheck(c);
	}
}
