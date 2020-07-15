package com.Bo;
import com.Vo.RulesVo;
import com.DAO.UpdateRuleDao;
public class UpdateRuleBo {
public RulesVo updateRule(RulesVo r)
{
	UpdateRuleDao updateRuleDaoObj = new UpdateRuleDao();
	return updateRuleDaoObj.updateRule(r);
}
}
