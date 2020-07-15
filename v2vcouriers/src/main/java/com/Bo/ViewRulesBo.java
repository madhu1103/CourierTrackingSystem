package com.Bo;
import com.DAO.ViewRulesDao;
import com.Vo.RulesVo;
import java.util.*;
public class ViewRulesBo {
public List<RulesVo> viewRules()
{
	ViewRulesDao viewRulesDaoObj = new ViewRulesDao();
	return viewRulesDaoObj.viewRules();
}
}
