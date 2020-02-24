package user.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import user.controller.sql.SqlQuery;
import user.controller.sql.SqlUtilPack;
import user.controller.util.Scope;
import user.model.bean.UserBean;

/**
 * Servlet implementation class User
 */
public class User extends HttpServlet {
	SqlUtilPack pack = new SqlUtilPack();
	Scope scope = new Scope();
	UserBean userbean = new UserBean();
	SqlQuery query = new SqlQuery();
	
	private static final long serialVersionUID = 1L;
       
    public User() { }


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		controller(request,response);
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	controller(request,response);
	}
	

    
    private void controller(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setCharacterEncoding("UTF-8");
    	
    	/** 세션 관리 */
    	HttpSession session = request.getSession();
    	session = scope.getSession(request,session);
    	

    	/** DB 연결 */
    	Connection conn = null;
    	conn = pack.getConnection(conn);
		
		/** --CRUD-- 어떤 요청이 들어왔는지 맞춰 수행 */
		String page = "/";
		switch (request.getParameter("control")) {
		
		/** Create 수행 */
		case "signUp":
			query.sighUpUser(conn, userbean, request);
			break;
			
		/** Retrieve 수행*/	
		case "selectUser":
			query.selectUser(conn, request);
			page="/userPage";
			break;
			
		/** Update 수행*/		
		case "updateUser" :
			query.updateUser(conn, request);
			page="/welcome";
			break;
			
		/** Delete 수행*/	
		case "deleteUser":
			query.deleteUser(conn, session);
			break;
			
		}
		SqlUtilPack.connectionClose(conn);
		request.getRequestDispatcher(page).forward(request, response);
	}
    
	

    

}
