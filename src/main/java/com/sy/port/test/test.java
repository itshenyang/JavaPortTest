package com.sy.port.test;

import com.sy.port.utils.L;

import java.io.*;
import java.util.*;

/**
 * Created by Administrator on 2017/10/10.
 */
public class test {

    private   static  String param1;
    private   static  String param2;

    static  {
        Properties prop =  new  Properties();
        InputStream in = Object. class .getResourceAsStream( "/port_config.properties" );
        try  {
            prop.load(in);
            param1 = prop.getProperty( "LocalIP.1" ).trim();
            param2 = prop.getProperty( "LocalPort.1" ).trim();
        }  catch  (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 私有构造方法，不需要创建对象
     */
    private  test() {

    }

    public   static  String getParam1() {
        return  param1;
    }

    public   static  String getParam2() {
        return  param2;
    }

    public   static   void  main(String args[]){
        L.w(getParam1());
        L.w(getParam2());
    }
}
