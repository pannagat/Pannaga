package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {


	static Properties prop=new Properties();
	static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getproperties();
		setproperties();
		getproperties();

	}
	public static void getproperties()
	{
		try
		{
			InputStream input=new FileInputStream(projectpath+"/src/test/java/Config/config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestDemo.browsername=browser;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

	}

	public static void setproperties()
	{
		try
		{
			OutputStream output=new FileOutputStream(projectpath+"/src/test/java/Config/config.properties");
			prop.setProperty("result", "Pass");
			prop.store(output, null);
			


		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}	


	}
}
