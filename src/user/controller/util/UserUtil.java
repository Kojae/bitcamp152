package user.controller.util;

import javax.servlet.http.HttpServletRequest;

import user.model.bean.UserBean;

/** 자주쓰지만 문장이 긴 메소드 모음 */
public class UserUtil {
    public UserBean setUserAll(HttpServletRequest request,UserBean userBean) {
    	userBean.setId(request.getParameter("id").trim()) ;
    	userBean.setPassword(request.getParameter("password").trim());
    	userBean.setNickName(request.getParameter("nickName"));
    	userBean.setAddress(request.getParameter("address"));
    	return userBean;
    }
}
