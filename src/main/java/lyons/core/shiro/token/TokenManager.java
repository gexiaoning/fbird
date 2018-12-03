
package lyons.core.shiro.token;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;

import lyons.common.exception.user.UserException;
import lyons.common.model.user.UUser;
import lyons.common.utils.MathUtil;
import lyons.common.utils.VisitorUtil;


public class TokenManager
{
    
    /**
     * 
     * @Title: login
     * @Description: shiro 登录 (密码md5封装加密)
     * @param uuser
     * @param rememberMe
     * @return: 
     */
    public static void login(UUser uuser) throws UserException
    {
        if (VisitorUtil.isSecurity(uuser))
        {
            UsernamePasswordToken token = 
                new UsernamePasswordToken(uuser.getuName(),MathUtil.getCharMd5(uuser.getuPassword()));
//        token.setRememberMe(true);//默认记住登录
            SecurityUtils.getSubject().login(token);
        }
        
    }
    
    /**
     * 
     * @Title: getToken
     * @Description:获取当前登录用户的user对象
     * @return
     * @return: UUser
     */
    public static UUser getToken()
    {
        return (UUser)SecurityUtils.getSubject().getPrincipal();
    }

    /**
     * @Title: logout
     * @Description: 账户退出
     * @return: void
     */
    public static void logout()
    {
        if (VisitorUtil.isLogin())
        {
            SecurityUtils.getSubject().logout();
        }
    }
    
}
