package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.sun.javafx.collections.MappingChange.Map;

import model.bean.MemberBean;


/**
 * mapping : /test.do
 * 
 */

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean bean1 = new  MemberBean();
		bean1.setId("고고고");
		bean1.setAddress("낙성대");
		bean1.setCartCount(4);
		bean1.setPassword("123456");
		bean1.setNickName("고씨아조씨");
		
		MemberBean bean2 = new  MemberBean();
		bean2.setId("재재재");
		bean2.setAddress("강북구");
		bean2.setCartCount(7);
		bean2.setPassword("456789");
		bean2.setNickName("고즤짱짱맨");
		
		MemberBean bean3 = new  MemberBean();
		bean3.setId("현현현");
		bean3.setAddress("강남구");
		bean3.setCartCount(15);
		bean3.setPassword("789123");
		bean3.setNickName("강남멋쟁이");
		
		request.setAttribute("bean1", bean1);
		request.setAttribute("bean2", bean2);
		request.setAttribute("bean3", bean3);
		
		List<MemberBean> list = new ArrayList<MemberBean>();
		list.add(bean1);
		list.add(bean2);
		list.add(null);
		list.add(bean3);
		request.setAttribute("members", list);
		
		
		
		HashMap<String, MemberBean> memberMap = new HashMap<String, MemberBean>();
		memberMap.put("Gold", bean1);
		memberMap.put("Silver", bean2);
		
		request.setAttribute("memberMap", memberMap);
		
//		request.getRequestDispatcher("/elTest.jsp").forward(request, response);
		request.getRequestDispatcher("/jstlTest2.jsp").forward(request, response);
	}
	
	
	
	

}
