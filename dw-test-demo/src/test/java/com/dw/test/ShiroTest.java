//package com.dw.test;
//
//import com.dw.demo.Application;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.config.IniSecurityManagerFactory;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.subject.Subject;
//import org.apache.shiro.util.Factory;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**
// *
// * @Author: zhanzhihong
// * @Date: 2021/2/24 17:09
// * @version v1.0
// */
//@SpringBootTest(classes = Application.class)
//@RunWith(SpringRunner.class)
//public class ShiroTest {
//    @Test
//    public void testHelloworld() {
//        //1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
//        Factory<SecurityManager> factory =
//                new IniSecurityManagerFactory("classpath:.ini");
//        //2、得到SecurityManager实例 并绑定给SecurityUtils
//        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
//        SecurityUtils.setSecurityManager(securityManager);
//        //3、得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
//
//        try {
//            //4、登录，即身份验证
//            subject.login(token);
//            System.out.println("登录成功");
//        } catch (AuthenticationException e) {
//            //5、身份验证失败
//            System.out.println("身份验证失败");
//        }
//
////        //6、退出
////        subject.logout();
//    }
//}