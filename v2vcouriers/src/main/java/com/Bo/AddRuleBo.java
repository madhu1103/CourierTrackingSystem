package com.Bo;

import com.Vo.RulesVo;
import com.DAO.AddRuleDao;

public class AddRuleBo {
	public RulesVo addRule(RulesVo r) {
		AddRuleDao addRuleDaoObj = new AddRuleDao();
		return addRuleDaoObj.addRule(r);
	}
}
