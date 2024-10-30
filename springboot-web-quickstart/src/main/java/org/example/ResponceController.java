package org.example;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.http.HttpResponse;

public class ResponceController {
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        //设置响应状态码
        response.setStatus(200);
        //设置响应头
        response.setHeader("name","itiheima");
        //设置响应体
        response.getWriter().write("<h1>hello response</h1>");
    }
}
