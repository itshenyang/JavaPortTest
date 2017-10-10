package com.sy.port.utils;

import com.sy.port.main.Main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Administrator on 2017/10/10.
 */
public class ReadPropertiesUtils {

    public static List<String> LocalIP =new ArrayList<>();

    public static List<Integer> LocalPort=new ArrayList<>();

    public static List<String> DestHost=new ArrayList<>();


    public static List<Integer> DestPort=new ArrayList<>();

    public static List<String> AllowClient=new ArrayList<>();


    static {
        Properties prop = new Properties();
        InputStream in = Object. class .getResourceAsStream( "/port_config.properties" );
        try {
            prop.load(in);
            for (int i = 1; i < 100; i++) {
                String OneLocalIP = null;
                Integer OneLocalPort = null;
                String OneDestHost = null;
                Integer OneDestPort = null;
                String OneAllowClient = null;
                try {
                    OneLocalIP = prop.getProperty("LocalIP." + i).trim();
                    OneLocalPort = Integer.parseInt(prop.getProperty("LocalPort." + i).trim());
                    OneDestHost = prop.getProperty("DestHost." + i).trim();
                    OneDestPort = Integer.parseInt(prop.getProperty("DestPort." + i).trim());
                    OneAllowClient = prop.getProperty("AllowClient." + i).trim();
                } catch (Exception e) {
                    break;
                }
                LocalIP.add(OneLocalIP);
                LocalPort.add(OneLocalPort);
                DestHost.add(OneDestHost);
                DestPort.add(OneDestPort);
                AllowClient.add(OneAllowClient);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 私有构造方法，不需要创建对象
     */
    private ReadPropertiesUtils() {

    }

    public static void main(String args[]) {
        System.out.println(LocalIP.toString());
        System.out.println(LocalPort.toString());
        System.out.println(DestHost.toString());
        System.out.println(DestPort.toString());
        System.out.println(AllowClient.toString());
    }


}
