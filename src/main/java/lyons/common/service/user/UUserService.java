
package lyons.common.service.user;

import lyons.common.model.user.UUser;


public interface UUserService
{
    /** login by username and userPassword　*/
    UUser login(String username, String pswd);
    
    /** checking for the existence of username */
    boolean isRegister(String username);
    
    /** register by username and userPassword　*/
    int register(UUser uuser);
    
    /** update userInfo*/
    int updateByPrimaryKeySelective(UUser user);

}