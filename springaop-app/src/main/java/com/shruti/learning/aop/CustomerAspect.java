
package com.shruti.learning.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class CustomerAspect{

    @Before("execution ")
    public void addCustomerAdvice(String name){
        System.out.println("executing advice add customer");
    }
}