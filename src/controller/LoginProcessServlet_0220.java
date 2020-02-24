package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.MemberBean;


/**
 * mapping : /login.do
 * 
 */

/**
 * Servlet implementation class LoginProcessServlet
 */
public class LoginProcessServlet_0220 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProcessServlet_0220() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	System.out.println("doget에 왔노라");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	
    	HttpSession session = req.getSession();
    	session.setMaxInactiveInterval(5*60);
		MemberBean bean1 = new  MemberBean();
		bean1.setId("고고고");
		bean1.setAddress("낙성대");
		bean1.setCartCount(6);
		bean1.setPassword("123456");
		bean1.setNickName("고씨아조씨");
		
		MemberBean bean2 = new  MemberBean();
		bean2.setId("재재재");
		bean2.setAddress("강북구");
		bean2.setCartCount(10);
		bean2.setPassword("456789");
		bean2.setNickName("고즤짱짱맨");
		
		MemberBean bean3 = new  MemberBean();
		bean3.setId("현현현");
		bean3.setAddress("강남구");
		bean3.setCartCount(15);
		bean3.setPassword("789123");
		bean3.setNickName("강남멋쟁이");
    	
		List<MemberBean> members = new ArrayList<MemberBean>();
		members.add(bean1);
		members.add(bean2);
		members.add(bean3);
		
    	String id = req.getParameter("id") ;
    	String password=req.getParameter("password");
    	for(MemberBean member : members) {
    		if(member.getId().equals(id) && member.getPassword().equals(password)) {
   				req.setAttribute("member", member);
   				session.setAttribute("sessionMember", member);
   				req.getRequestDispatcher("/welcome").forward(req, resp);
    			break;
   			}
   		}
    		
		/*
		 * req.setAttribute("sessionMember", members.get(0));
		 * session.setAttribute("sessionMember", members.get(1));
		 * req.getRequestDispatcher("/welcome").forward(req, resp);
		 */
    	if(req.getAttribute("member") == null) {
    		req.getRequestDispatcher("/loginFail").forward(req, resp);
    	}
    }
}
