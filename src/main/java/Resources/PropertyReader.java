package Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public  class PropertyReader {

public static String ApplicationConfigReader(String key) throws IOException {
	
	Properties prop = new Properties();
	File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\Framework\\FirstFrame\\Config.properties");
	FileReader fr = new FileReader(f);
	prop.load(fr);
	return prop.get(key).toString();
}


}
