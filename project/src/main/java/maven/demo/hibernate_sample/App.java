package maven.demo.hibernate_sample;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		SessionFactory sf= HibernateSf.createSession();
		if(sf!=null){
			System.out.println( "Hello World!" );
		}
	}
}
