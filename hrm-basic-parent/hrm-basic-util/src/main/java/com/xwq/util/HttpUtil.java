package com.xwq.util;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.util.*;
/**

 <!--短信接口需要的包-->
<dependency>
    <groupId>commons-httpclient</groupId>
    <artifactId>commons-httpclient</artifactId>
    <version>3.1</version>
</dependency>
<dependency>
    <groupId>commons-codec</groupId>
    <artifactId>commons-codec</artifactId>
    <version>1.4</version>
</dependency>

**/

public class HttpUtil {

    //post请求 "http://gbk.api.smschinese.cn"
    public static String sendPost(String url, Map<String,String> param ){
        try{
            //1.创建一个http客户端
            HttpClient client = new HttpClient ();
            //2.创建post请求，指定请求的地址
            PostMethod post = new PostMethod(url);
            //3.设置请求头
            post.addRequestHeader("Content-Type",
                    "application/x-www-form-urlencoded;charset=utf-8");//在头文件中设置转码

            //4.封装参数
            Set<String> keys = param.keySet();

            List<NameValuePair> nameValuePairs = new ArrayList<>();

            for(String key : keys){
                NameValuePair nameValuePair = new NameValuePair(key, param.get(key));
                nameValuePairs.add(nameValuePair);
            }
            post.setRequestBody(nameValuePairs.toArray(new NameValuePair[]{}));

            //5.执行请求
            client.executeMethod(post);
            int statusCode = post.getStatusCode();
            System.out.println("statusCode:"+statusCode);

            //6.获取结果
            String result = new String(post.getResponseBodyAsString().getBytes("utf-8"));
            System.out.println(result); //打印返回消息状态
            post.releaseConnection();

            return result;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("HTTP请求失败");
        }
    }
}
