package user.controller.sql;

import java.sql.Connection;
import java.sql.DriverManager;
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

public class SqlUtilPack {
	Scope scope = new Scope();
	UserUtil userUtil = new UserUtil();
	HttpSession session ;
	
	public Connection getConnection(Connection conn) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/sample?", "root", "1234");
			System.out.println("Can use connetion");
			
		} catch (InstantiationException e) {
			System.out.println("InstantiationException");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("IllegalAccessException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		return conn;
	}
	public static void connectionClose(Connection conn) {
		 try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
