package com.mhm.webservice.cxf;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by MHm on 2018/11/28.
 */
@WebService(serviceName = "SCService", // 与接口中指定的name一致
targetNamespace = "http://webservice.mhm.com/", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.mhm.webservice.cxf.SCService"// 接口地址
)
@Component
public class SCServiceImp implements SCService {
    @Override
    public String sayHello(String name) {
        return "Hello ," + name;
    }
}
