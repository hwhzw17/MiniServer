package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import server.SystemConfiguration;

public class ReadFile {

	public static void readProperties(String filePath) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filePath));
			SystemConfiguration sysConf = SystemConfiguration.getInstance();
			// host
			sysConf.setHost(prop.getProperty("host"));
			// port
			sysConf.setPort(prop.getProperty("port"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
