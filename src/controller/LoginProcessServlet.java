package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.bean.MemberBean;
import user.model.bean.UserBean;


/**
 * mapping : /login.do
 * 
 */

/**
 * Servlet implementation class LoginProcessServlet
 */
public class LoginProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginProcessServlet() {
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
    	
    	if(! session.isNew()) {
    		session.invalidate();
    		session = req.getSession(true);
    	}
    	
		
    	String id = req.getParameter("id").trim() ;
    	String password=req.getParameter("password").trim();
    	
    	
    	Connection conn = null;
		PreparedStatement pState = null;
		ResultSet resultset = null;
    	
		UserBean member = new UserBean();
		
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			System.out.println("Driver can");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sample?", "root", "1234");
			
			String sql ="SELECT nickName, cartCount FROM member WHERE id = ? and password = ? ";   

			pState= conn.prepareStatement(sql);
			
			pState.setString(1, id);
			pState.setString(2, password);
			
			resultset = pState.executeQuery() ;
			String nextPage = null;
			
			if(resultset.next()) {  //아이디와 암호가 일치하는 사람이 있다면
				member.setId(id);
				member.setNickName(resultset.getString("nickName"));
				member.setCartCount(resultset.getInt("cartCount"));
				
				req.setAttribute("memberBean", member);
				session.setAttribute("member", member);
				session.setMaxInactiveInterval(5*60);
				nextPage = "/welcome";
				req.getRequestDispatcher(nextPage).forward(req, resp);
			}else {
				nextPage = "/loginFail";
				resp.sendRedirect(nextPage);
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
//    	for(MemberBean member : members) {
//    		if(member.getId().equals(id) && member.getPassword().equals(password)) {
//   				req.setAttribute("member", member);
//   				session.setAttribute("sessionMember", member);
//   				req.getRequestDispatcher("/welcome").forward(req, resp);
//    			break;
//   			}
//   		}
    		
		/*
		 * req.setAttribute("sessionMember", members.get(0));
		 * session.setAttribute("sessionMember", members.get(1));
		 * req.getRequestDispatcher("/welcome").forward(req, resp);
		 */
//    	if(req.getAttribute("member") == null) {
//    		req.getRequestDispatcher("/loginFail").forward(req, resp);
//    	}
    }
}
