package user.controller.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import user.model.bean.UserBean;

/**  Session scope 관리 및 설정하는 클래스 */
public class Scope {
	
	public HttpSession getSession(HttpServletRequest request, HttpSession session) {
		session = request.getSession();
		return session;
	}
	
	public void setSession(HttpSession session, UserBean member) {
		session.setAttribute("member", member);
	}
	
	public void setResetSession(HttpSession session, UserBean member) {
		session.invalidate();
		session.setAttribute("member", member);
	}
	
	
	
}
