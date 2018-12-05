package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.base.TestBase;

public class propertiesFile {
	static Properties properties;
	public static void main(String[] args) {
		getProperties();
	}

	public static void getProperties() {

		try {
			properties = new Properties();
			InputStream instream = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
			properties.load(instream);
			String browser = properties.getProperty("browser");
			//System.out.println(browser);
            TestBase.browsername= browser;
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public static void setProperties() {
		try {
			OutputStream outStream = new FileOutputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
			properties.setProperty("results", "Pass");
			properties.store(outStream, null);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
