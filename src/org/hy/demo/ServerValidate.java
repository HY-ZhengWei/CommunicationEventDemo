package org.hy.demo;

import org.hy.common.net.ServerSocketValidate;
import org.hy.common.net.data.LoginRequest;





/**
 * 自定义服务端的登陆验证  
 *
 * @author      ZhengWei(HY)
 * @createDate  2017-01-15
 * @version     v1.0
 */
public class ServerValidate implements ServerSocketValidate
{
    
    /**
     * 服务端的登陆验证方法
     * 
     * @author      ZhengWei(HY)
     * @createDate  2017-01-15
     * @version     v1.0
     *
     * @param i_LoginRequest  登陆信息
     * @return                验证成功时，返回true
     */
    public boolean validate(LoginRequest i_LoginRequest)
    {
        if ( "ZhengWei(HY)".equals(i_LoginRequest.getUserName())  
          && "2017-01-15"  .equals(i_LoginRequest.getPassword()) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
