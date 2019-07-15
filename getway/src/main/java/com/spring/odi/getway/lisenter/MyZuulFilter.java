package com.spring.odi.getway.lisenter;

import com.google.gson.Gson;
import com.netflix.loadbalancer.DynamicServerListLoadBalancer;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@Component
@Order(-1)
public class MyZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";//可以在请求被路由之前调用
    }

    @Override
    public int filterOrder() {
        return 0;//filter执行顺序，通过数字指定 ,优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return true;// 是否执行该过滤器，此处为true，说明需要过滤
    }

    /**
     *  filter需要执行的具体操作
     *
     * 例如：本filter实际执行的逻辑 是验证所有的访问请求中，是否包含安全信息auth
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String auth = request.getParameter("auth");
        System.out.println("zuul拦截--请求前验证---auth："+auth);
        System.out.println("zuulPath:"+request.getRequestURI());
        System.out.println("zuul:"+request.getSession().getId());
        System.out.println("postman-token"+request.getHeader("postman-token"));
        System.out.println("access_token"+request.getHeader("access_token"));
        for (Cookie cookie : request.getCookies()) {
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
        //成功的情况
//        if (StringUtils.isNotBlank(auth)){
//            ctx.setSendZuulResponse(true); //对请求进行路由
//            ctx.setResponseStatusCode(200);
//            ctx.set("isSuccess", true);
//        }else {
//            //失败的情况
//            HttpServletResponse res = ctx.getResponse();
//            ctx.setSendZuulResponse(false); //不对请求进行路由
//            ctx.setResponseStatusCode(res.getStatus());//设置返回状态码
//            Gson gson = new Gson();
//            ctx.setResponseBody(gson.toJson(res));//设置返回响应体
//            ctx.set("isSuccess", false);
//            ctx.getResponse().setContentType("application/json;charset=UTF-8");//设置返回响应体格式，可能会乱码
//
//        }

        return null;
    }
}