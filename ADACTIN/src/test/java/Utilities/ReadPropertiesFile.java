package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	Properties properties;
	String path="D:\\02-Projects\\ADACTIN\\src\\test\\java\\Utilities\\Config.properties";
	
	public  ReadPropertiesFile() {
		
		properties =new Properties();
		try {
			FileInputStream fs=new FileInputStream(path);
			try {
				properties.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  String getUrl() {
		String url=properties.getProperty("url");
		if(url!=null) {
			return url;
		}else 
			throw new RuntimeException("Url not specify Exception ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
