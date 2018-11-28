package com.mhm.webservice.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 铁塔B接口
 * Created by MHm on 2018/11/28.
 */
@WebService(name = "SCService", // 暴露服务名称
targetNamespace = "http://webservice.mhm.com/"// 命名空间,一般是接口的包名倒序
)
public interface SCService {
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    public String sayHello(@WebParam(name = "userName") String name);
}
