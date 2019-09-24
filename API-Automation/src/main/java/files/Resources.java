package files;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

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
	
	public static String getJIRAKey(String jirahost) {
		Response jirares = given().baseUri(jirahost).
		header("Content-Type","application/json").
		body("{ \"username\": \"user\", \"password\": \"pass\" }").
		when().
		post("/rest/auth/1/session").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
		
		String outres = jirares.asString();
		System.out.println(outres);
		//convert response into JSON
		JsonPath js = new JsonPath(outres);
		String session = js.get("session.value");
		System.out.println(session);
		return session;
	}	
}
