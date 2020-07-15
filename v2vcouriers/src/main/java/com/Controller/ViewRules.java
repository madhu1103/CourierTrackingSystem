package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Bo.ViewRulesBo;
import com.Vo.RulesVo;
import java.util.*;
@WebServlet("/ViewRules")
public class ViewRules extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ViewRulesBo viewRulesBoObj = new ViewRulesBo();
		List<RulesVo> list = viewRulesBoObj.viewRules();
		if(list.isEmpty())
		{
			request.setAttribute("empty", "No Record Found");
			request.getRequestDispatcher("Rules.jsp").forward(request,response);
		}
		else
		{
		request.setAttribute("RulesData", list);
		request.getRequestDispatcher("Rules.jsp").forward(request,response);
		}
	}

}
