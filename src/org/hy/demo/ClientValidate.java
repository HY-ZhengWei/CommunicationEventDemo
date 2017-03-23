package org.hy.demo;

import org.hy.common.net.ClientSocketValidate;
import org.hy.common.net.data.LoginRequest;





/**
 * 客户端登陆服务端的登陆信息接口  
 *
 * @author      ZhengWei(HY)
 * @createDate  2017-01-15
 * @version     v1.0
 */
public class ClientValidate implements ClientSocketValidate
{
    
    /**
     * 客户端的获取登陆信息
     * 
     * @author      ZhengWei(HY)
     * @createDate  2017-01-15
     * @version     v1.0
     *
     * @return
     */
    public LoginRequest getLoginRequest()
    {
        return new LoginRequest("ZhengWei(HY)" ,"2017-01-15");
    }
    
}
