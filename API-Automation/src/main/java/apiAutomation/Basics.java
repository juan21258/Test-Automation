package apiAutomation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.IOException;
import files.Payload;
import files.Resources;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class Basics {
	
	@Step
	public void getPreguntas() {
		given().baseUri("https://vivevinosdummy.azurewebsites.net").
		param("action","GetPreguntas").
		when().
		get("/preguntas").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
	}
	
	@Step
	public void postData() {
		String b = "{\r\n" + 
				" \r\n" + 
				"    \"location\":{\r\n" + 
				" \r\n" + 
				"        \"lat\" : -38.383494,\r\n" + 
				" \r\n" + 
				"        \"lng\" : 33.427362\r\n" + 
				" \r\n" + 
				"    },\r\n" + 
				" \r\n" + 
				"    \"accuracy\":50,\r\n" + 
				" \r\n" + 
				"    \"name\":\"Frontline house\",\r\n" + 
				" \r\n" + 
				"    \"phone_number\":\"(+91) 983 893 3937\",\r\n" + 
				" \r\n" + 
				"    \"address\" : \"29, side layout, cohen 09\",\r\n" + 
				" \r\n" + 
				"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
				" \r\n" + 
				"    \"website\" : \"http://google.com\",\r\n" + 
				" \r\n" + 
				"    \"language\" : \"French-IN\"\r\n" + 
				" \r\n" + 
				"}\r\n" + 
				"";
		Response res = given().baseUri("http://216.10.245.166").queryParam("key", "qaclick123").
		body(b).when().post("/maps/api/place/add/json").then().assertThat().statusCode(202).
		extract().response();
		
		String outres = res.asString();
		System.out.println(outres);
		
		/*int count = js.get("results.size()");
		 * for(int i = 0; i < count;i++) {
			String look = js.get("results["+i+"].name");
			System.out.println(look);
		}*/
	}
	
	@Step
	public void removePlace() {
		given().baseUri("http://216.10.245.166").
			queryParam("key", "qaclick123").body("{\r\n" + 
			"	\"place_id\":\"a56dbc59b14f11f22dc3228e20d58348\"\r\n" + 
			"}").when().
			post("/maps/api/place/delete/json").
			then().assertThat().statusCode(200).and().contentType(ContentType.JSON).log().body();
	}
	
	@Step
	public void grabAndDeletePlace(String host) {
		
		Response res2 = given().baseUri(host).queryParam("key", "qaclick123").
		body(Payload.getPostData()).when().post(Resources.addPostData()).then().assertThat().statusCode(200).
		extract().response();
		
		String outres = res2.asString();
		System.out.println(outres);
		//convert response into JSON
		JsonPath js = new JsonPath(outres);
		//Get a specific part of the response String arg = js.get("arg");
		//Grab the place id value
		String placeid = js.get("place_id");
		
		//Delete place
		String target = Payload.targetPlace(placeid);
		Response output = given().baseUri(host).queryParam("key", "qaclick123").
		body(target).when().post(Resources.deletePostData()).then().assertThat().statusCode(200).
		and().contentType(ContentType.JSON).and().body("status", equalTo("OK")).extract().response();
		String out = output.asString();
		System.out.println(out);
	}
	
	@Step
	public void postXML() throws IOException {
		String postdata = Resources.GenerateStrinsFromResource("C:\\Users\\juan.perez\\Desktop\\postdata.xml");
		Response res4 = given().baseUri("http://216.10.245.166").
		queryParam("key", "qaclick123").body(postdata).when().
		post("/maps/api/place/add/xml").
		then().assertThat().statusCode(200).and().contentType(ContentType.XML).extract().response();
		
		String xmlresponse = res4.asString();
		XmlPath x = new XmlPath(xmlresponse);
		String out = x.get("response.place_id");
		System.out.println(out);
	}		
}
