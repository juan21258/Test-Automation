package apiAutomation;

import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;

public class TwitterAPI {
	
	String ConsumerKey="ztXsFr0ipQTIDue4MD20s4aL3";
	String ConsumerSecret="kuOlC5wB1DZ8ahgOsEos1zLa7C4fLmlpSSB5QEJmFFEX70CT2n";
	String Token="917476985835851778-vOmu4mScebK0zi7hTPXgprO9A7BMLsw";
	String TokenSecret="tCw78M48rJC2mNWpNvZJuXhGUqFgQ8mqowdsjrDbwbQLs";
	String id;
	
	@Step
	public void getLatestTweet() {
		
	Response res = given().baseUri("https://api.twitter.com/1.1/statuses").auth().oauth(ConsumerKey, ConsumerSecret, Token, TokenSecret)
		.queryParam("count", "1")
		.when().get("/home_timeline.json").then().extract().response();
	String response =res.asString();
	System.out.println(response);
	JsonPath js= new JsonPath(response);
	String lookid = js.get("id");
	String looktext = js.get("text");
	System.out.println(looktext);
	System.out.println(lookid);
	}
	
	@Step
	public void createTweet() {
		
	Response res = given().baseUri("https://api.twitter.com/1.1/statuses").auth().oauth(ConsumerKey, ConsumerSecret, Token, TokenSecret)
		.queryParam("status", "I am creating this tweet with Automation")
		.when().post("/update.json").then().extract().response();
	String response =res.asString();
	System.out.println(response);
	JsonPath js= new JsonPath(response);
	System.out.println("Below is the tweet added");
	String lookid = js.get("id");
	System.out.println(lookid);
	id=js.get("id").toString();
	
	
	}
	
	@Step
	public void E2E() {
	createTweet();
	Response res = given().baseUri("https://api.twitter.com/1.1/statuses").auth().oauth(ConsumerKey, ConsumerSecret, Token, TokenSecret)
		.when().post("/destroy/"+id+".json").then().extract().response();
	String response =res.asString();
	System.out.println(response);
	JsonPath js= new JsonPath(response);
	//System.out.println(js.get("text"));
	System.out.println("Tweet which got deleted with automation is below");
	String looktext = js.get("text");
	String looktruncated = js.get("truncated");
	System.out.println(looktext);
	System.out.println(looktruncated);
	}
}
