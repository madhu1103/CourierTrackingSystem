package com.Bo;
import com.Vo.*;
import com.DAO.*;
public class LoginBo {
	public UserVo loginCheck(UserVo u)
	{
		
		LoginDao loginDaoObj = new LoginDao();
		return loginDaoObj.loginCheck(u);
	}
	
}
