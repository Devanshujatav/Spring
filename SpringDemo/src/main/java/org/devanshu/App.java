package org.devanshu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        System.out.println( "Hello World!" );

        BeanFactory factory = new ClassPathXmlApplicationContext("Spring.xml");
        Alien obj = (Alien) factory.getBean("Alien");
        obj.code();
    }

}
