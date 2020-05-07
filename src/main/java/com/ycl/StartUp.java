package com.ycl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : YangChunLong
 * @date : Created in 2020/5/7 22:00
 * @description: 启动类
 * @modified By:
 * @version: :
 */
public class StartUp {
    private static AbstractApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
        applicationContext.start();
        System.out.println("start success...");
        while (true){
            try{
                Thread.sleep(Integer.MAX_VALUE);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
