package example28;

import java.io.IOException;
import java.util.Properties;

public class Properties_Run {

	public static void main(String[] args) {
		Properties property = new Properties();
		try {
			property.load(Properties_Run.class.getResourceAsStream("database.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String driver = property.getProperty("driver");
		String url = property.getProperty("url");
		System.out.println(driver);
		System.out.println(url);
	}
}