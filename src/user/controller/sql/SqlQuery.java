package user.controller.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import user.controller.util.Scope;
import user.controller.util.UserUtil;
import user.model.bean.UserBean;

public class SqlQuery {
	SqlUtilPack pack = new SqlUtilPack();
	Scope scope = new Scope();
	UserBean userbean = new UserBean();
	UserUtil userUtil = new UserUtil();
	
	public SqlQuery() {}

	/** 
	 * request parameter로 온 값을 DB, session에 등록
	 * @param Connection, UserBean ,HttpServletRequest
	 **/ 
	public void sighUpUser(Connection conn, UserBean userbean,HttpServletRequest request) {
		HttpSession session = request.getSession();
		userbean = userUtil.setUserAll(request, userbean);
		scope.setSession(session, userbean);
		
		PreparedStatement pState = null;
		String sql = "INSERT INTO member (id, password, nickName, address) VALUES(?,?,?,?)";
		
		try {
			pState = conn.prepareStatement(sql);
			pState.setString(1, userbean.getId());
			pState.setString(2, userbean.getPassword());
			pState.setString(3, userbean.getNickName());
			pState.setString(4, userbean.getAddress());
			pState.execute();
			
		} catch (SQLException e) {
			System.out.println("sighUpUser() SQLException");
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/** 
	 * 모든 유저의 정보를 조회한다.
	 * @param Connection, HttpServletRequest
	 **/  
	public void selectUser(Connection conn,HttpServletRequest request) {
		PreparedStatement pState = null;
		ResultSet resultset = null;
		List<Map> list = new ArrayList<Map>();
        Map<String, UserBean> map;

		String sql = "SELECT nickname,address,cartcount FROM member "
				+ "ORDER BY id ASC;";
		try {
			pState = conn.prepareStatement(sql);
			resultset = pState.executeQuery() ;
			
			/** List안에 Map형식으로 멤버 넣고 request Scope에 저장 */
			while(resultset.next()) {
				UserBean userBean = new UserBean();
					map = new HashMap<String, UserBean>();
						userBean.setNickName(resultset.getString("nickName"));
						userBean.setAddress(resultset.getString("address"));
						userBean.setCartCount(resultset.getInt("cartCount"));
					map.put("user",userBean);
				list.add(map);
				request.setAttribute("users", list);
			}
		}catch (SQLException e) {
			System.out.println("sighUpUser() SQLException");
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateUser(Connection conn, HttpServletRequest request) {

		PreparedStatement pState = null;
		String sql = "UPDATE member SET nickName = ?, address = ? "
				  + " WHERE id = ?;";
		UserUtil util = new UserUtil();
		UserBean userBean = new UserBean();
		HttpSession session = null ; 

		userBean = util.setUserAll(request, userBean);
		session = scope.getSession(request,session);
		
		try {
			pState = conn.prepareStatement(sql);
			pState.setString(1, userBean.getNickName().trim());
			pState.setString(2, userBean.getAddress().trim());
			pState.setString(3, userBean.getId().trim());
			
			scope.setSession(session, userBean);
			
			if( ! pState.execute()) {
					pState.execute();
			}
		}catch (SQLException e) {
			System.out.println("sighUpUser() SQLException");
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void deleteUser(Connection conn, HttpSession session) {
		PreparedStatement pState = null;
		String sql = "DELETE FROM member where id = ?;";
		UserBean userBean = (UserBean)session.getAttribute("member");
		
		try {
			pState = conn.prepareStatement(sql);
			pState.setString(1, userBean.getId());
			
			if( ! pState.execute()) {
				pState.execute();
			}
			session.invalidate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
