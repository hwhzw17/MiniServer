package server;

import java.io.IOException;
import java.nio.channels.Selector;

import util.ReadFile;

public class MiniServer {
	public static void main(String[] args) {
		System.out.println(123);
	}

	public static void initializeServer() {
		// read system properties
		readSystemProperties();
		// create Selector
		Selector selector = null;
		try {
			selector = Selector.open();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readSystemProperties() {
		// read system properties
		ReadFile.readProperties("/conf/system.properties");
	}

}
