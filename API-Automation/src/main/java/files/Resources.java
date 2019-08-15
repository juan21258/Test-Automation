package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Resources {
	
	public static String addPostData() {
		String res = "/maps/api/place/add/json";
		return res;
	}
	
	public static String deletePostData() {
		String res = "/maps/api/place/delete/json";
		return res;
	}
	
	public static String GenerateStrinsFromResource(String path) throws IOException {
		return new String(Files.readAllBytes(Paths.get(path)));
	}
}
