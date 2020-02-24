package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.bean.MemberBean;

public class JDBCTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pState = null;
		ResultSet resultset = null;
		MemberBean bean = new MemberBean();
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				System.out.println("Driver load OK  ! 읒 완료 ");
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost/sample?", "root", "1234");
				System.out.println("can conn ? 성공 ");

				//member table에서 장바구니에 5개이상인 멤버목록 조회(해당되는 사람들,)
				String sql ="SELECT id, nickName, address, cartCount FROM member WHERE cartCount >= ?";   

				pState= conn.prepareStatement(sql);
				
				pState.setInt(1,5);
				
				resultset = pState.executeQuery() ;
				
				while(resultset.next()) {
					System.out.println("이름 : "+resultset.getString("id")+",  닉네임 : "+resultset.getString("nickName")+
							",  주소 : "+resultset.getString(3)+",  장바구니 : "+resultset.getString(4));
					
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
			
			
			
		
	}
}
