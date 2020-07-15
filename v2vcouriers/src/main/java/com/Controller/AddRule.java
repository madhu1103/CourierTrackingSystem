package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Vo.RulesVo;
import com.Bo.AddRuleBo;

@WebServlet("/AddRule")
public class AddRule extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RulesVo obj = new RulesVo();
		obj.setRule(request.getParameter("NewRuletxt"));
		
		AddRuleBo addRuleBoObj = new AddRuleBo();
		RulesVo r = addRuleBoObj.addRule(obj);
		if (r.getStatus() == 1) {
			request.setAttribute("status", "Successfully Inserted!!");
			request.getRequestDispatcher("ViewRules").forward(request, response);
		} else {
			request.setAttribute("status", "Policy is not inserted!!");
			request.getRequestDispatcher("ViewRules").forward(request, response);
		}
		
		
	}

}
