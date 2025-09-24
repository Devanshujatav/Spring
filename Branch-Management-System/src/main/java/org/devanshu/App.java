package org.devanshu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        System.out.println( "Hello World!" );
        Branch brch = new Branch("Smith" , 10121);

//        brch.setManagerName("Smith");
//        brch.setIfscCode(10121);
        System.out.println(brch.getManagerName());
        System.out.println(brch.getIfscCode());
    }

}
