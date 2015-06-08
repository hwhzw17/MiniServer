package server;

public class SystemConfiguration {
	private static SystemConfiguration sysConf = null;

	private String host = null;
	private String port = null;

	private SystemConfiguration() {
	}

	public static SystemConfiguration getInstance() {
		if (sysConf == null) {
			sysConf = new SystemConfiguration();
		}
		return sysConf;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
