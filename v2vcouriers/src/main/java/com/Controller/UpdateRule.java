package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Vo.RulesVo;
import com.Bo.UpdateRuleBo;
@WebServlet("/UpdateRule")
public class UpdateRule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RulesVo obj = new RulesVo();
		obj.setNumber(Integer.parseInt(request.getParameter("RuleNumbertxt").toString()));
		obj.setRule(request.getParameter("Ruletxt"));
		UpdateRuleBo updateRuleBoObj = new UpdateRuleBo();
		RulesVo r = updateRuleBoObj.updateRule(obj);
		if(r.getStatus()==1)
		{
			request.setAttribute("status", "Successfully Inserted!!");
			request.getRequestDispatcher("ViewRules").forward(request, response);
		}
		else
		{
			request.setAttribute("status", "Policy is not Updated. Please Check Your Input...!!");
			request.getRequestDispatcher("ViewRules").forward(request, response);
		}
	}

}
