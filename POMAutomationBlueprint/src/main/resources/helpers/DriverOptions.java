package helpers;

public class DriverOptions {
	private String firefoxKey = "webdriver.gecko.driver";
	private String firefoxValue = "geckodriver.exe";
	
	private String chromeKey = "webdriver.chrome.driver";
	private String chromeValue = "chromedriver.exe";
	
	public String getFirefoxKey() {
		return firefoxKey;
	}
	
	public void setFirefoxKey(String firefoxKey) {
		this.firefoxKey = firefoxKey;
	}
	
	public String getFirefoxValue() {
		return firefoxValue;
	}
	
	public void setFirefoxValue(String firefoxValue) {
		this.firefoxValue = firefoxValue;
	}
	
	public String getChromeKey() {
		return chromeKey;
	}
	
	public void setChromeKey(String chromeKey) {
		this.chromeKey = chromeKey;
	}
	
	public String getChromeValue() {
		return chromeValue;
	}
	
	public void setChromeValue(String chromeValue) {
		this.chromeValue = chromeValue;
	}
}
