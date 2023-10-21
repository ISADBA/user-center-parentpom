package com.atguigu.maven;

/**
 * Hello world!
 *
 */
import com.atguigu.maven.Calculate;
public class App 
{
    public static void main( String[] args )
    {
        Calculate cal = new Calculate();
        int result = cal.add( 200, 200 );
        System.out.println( "Hello World!" + result );
    }
}
