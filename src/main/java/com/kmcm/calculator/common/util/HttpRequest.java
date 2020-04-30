package com.kmcm.calculator.common.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpRequest {
    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL( urlNameString );
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty( "accept", "*/*" );
            connection.setRequestProperty( "connection", "Keep-Alive" );
            connection.setRequestProperty( "user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)" );
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println( key + "--->" + map.get( key ) );
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader( new InputStreamReader(
                    connection.getInputStream() ) );
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println( "发送GET请求出现异常！" + e );
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL( url );
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty( "accept", "*/*" );
            conn.setRequestProperty( "Content-type", "application/json" );
            conn.setRequestProperty( "connection", "Keep-Alive" );
            conn.setRequestProperty( "user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)" );
            // 发送POST请求必须设置如下两行
            conn.setDoOutput( true );
            conn.setDoInput( true );
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter( conn.getOutputStream() );
            // 发送请求参数
            out.print( param );
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader( conn.getInputStream() ) );
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println( "发送 POST 请求出现异常！" + e );
            e.printStackTrace();
        }
        // 使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // 发送 GET 请求
        // String s = HttpRequest.sendGet(
        // "http://localhost:6144/Home/RequestString", "key=123&v=456");
        // System.out.println(s);

        // 发送 POST 请求
        String sr = HttpRequest
                .sendPost(
                        "http://localhost:6144/Home/RequestString",
                        "\u4e09\u5929\u7684\u4f53\u80b2\u57f9\u8bad\u5728\u8f7b\u677e\u6109\u60a6\u7684\u6c1b\u56f4\u4e2d\u7ed3\u675f\uff0c\u53c2\u8bad\u6559\u5e08\u5728\u5e0c\u671b\u4e5d\u6d32\u57f9\u8bad\u8001\u5e08\u7684\u5e26\u9886\u4e0b\uff0c\u5b66\u5230\u4e86\u66f4\u524d\u6cbf\u7684\u4f53\u80b2\u7406\u8bba\u77e5\u8bc6\u548c\u4f53\u80b2\u6d3b\u52a8\u5b9e\u8df5\u64cd\u4f5c\u8981\u9886\uff0c\u63d0\u9ad8\u4e86\u4e61\u6751\u5b66\u6821\u4f53\u80b2\u6559\u5b66\u8d28\u91cf\uff0c\u4e3a\u4e61\u6751\u513f\u7ae5\u7684\u8eab\u5fc3\u5065\u5eb7\u53d1\u80b2\u5960\u5b9a\u4e86\u575a\u5b9e\u7684\u57fa\u7840\u3002" );
        System.out
                .println( "\u4e09\u5929\u7684\u4f53\u80b2\u57f9\u8bad\u5728\u8f7b\u677e\u6109\u60a6\u7684\u6c1b\u56f4\u4e2d\u7ed3\u675f\uff0c\u53c2\u8bad\u6559\u5e08\u5728\u5e0c\u671b\u4e5d\u6d32\u57f9\u8bad\u8001\u5e08\u7684\u5e26\u9886\u4e0b\uff0c\u5b66\u5230\u4e86\u66f4\u524d\u6cbf\u7684\u4f53\u80b2\u7406\u8bba\u77e5\u8bc6\u548c\u4f53\u80b2\u6d3b\u52a8\u5b9e\u8df5\u64cd\u4f5c\u8981\u9886\uff0c\u63d0\u9ad8\u4e86\u4e61\u6751\u5b66\u6821\u4f53\u80b2\u6559\u5b66\u8d28\u91cf\uff0c\u4e3a\u4e61\u6751\u513f\u7ae5\u7684\u8eab\u5fc3\u5065\u5eb7\u53d1\u80b2\u5960\u5b9a\u4e86\u575a\u5b9e\u7684\u57fa\u7840\u3002" );
        System.out.println( sr );

    }


}
