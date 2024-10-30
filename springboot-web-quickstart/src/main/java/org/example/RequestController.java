package org.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        String method=request.getMethod();
        System.out.println("请求方式："+method);
        String url=request.getRequestURL().toString();
        System.out.println("url地址："+url);
        String uri=request.getRequestURI();
        System.out.println("uri地址:"+uri);
        String protocol=request.getProtocol();
        System.out.println(protocol);
        String name=request.getParameter("name");

        return "OK";
    }
}
