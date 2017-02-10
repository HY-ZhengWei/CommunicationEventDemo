package org.hy.demo;

import java.util.Map;

import org.hy.common.Help;
import org.hy.common.net.CommunicationListener;
import org.hy.common.net.data.CommunicationRequest;
import org.hy.common.net.data.CommunicationResponse;
import org.hy.common.xml.XJava;
import org.hy.common.xml.annotation.XType;
import org.hy.common.xml.annotation.Xjava;





/**
 * 项目间相互通讯的事件机构(事件类型可自定义)的演示服务端Demo
 *
 * @author      ZhengWei(HY)
 * @createDate  2017-02-10
 * @version     v1.0
 */
@Xjava(value=XType.XML)
public class ServerDemo implements CommunicationListener
{
    
    public static void main(String [] args) throws Exception
    {
        XJava.parserAnnotation(ServerDemo.class.getName());
        
        System.out.println("服务已启动");
    }
    
    
    
    /**
     *  数据通讯的事件类型。
     *  
     *  事件类型区分大小写
     * 
     * @author      ZhengWei(HY)
     * @createDate  2017-02-10
     * @version     v1.0
     *
     * @return
     */
    public String getEventType()
    {
        return "Demo";
    }
    
    
    
    /**
     * 数据通讯事件的执行动作
     * 
     * @author      ZhengWei(HY)
     * @createDate  2017-02-10
     * @version     v1.0
     *
     * @param i_RequestData
     * @return
     */
    @SuppressWarnings("unchecked")
    public CommunicationResponse communication(CommunicationRequest i_RequestData)
    {
        CommunicationResponse v_ResponseData = new CommunicationResponse();
        
        if ( i_RequestData.getData() == null )
        {
            v_ResponseData.setResult(1);
            return v_ResponseData;
        }
        
        Map<String ,Object> v_DataMap = (Map<String ,Object>)i_RequestData.getData();
        if ( Help.isNull(v_DataMap) )
        {
            v_ResponseData.setResult(2);
            return v_ResponseData;
        }
            
        v_ResponseData.setData(Help.toListKeys(v_DataMap));
        
        return v_ResponseData;
    }
    
}
