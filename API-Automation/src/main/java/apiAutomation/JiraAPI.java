package apiAutomation;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import files.Resources;
import files.Payload;

public class JiraAPI {
	
	@Step
	public void createIssue(String jirahost) {
		Response create = given().baseUri(jirahost).
				header("Content-Type","application/json").
				header("Cookie","JSESSIONID="+Resources.getJIRAKey(jirahost)).
				body(Payload.jiraBody()).
				when().
				post("/rest/api/2/issue").
				then().assertThat().statusCode(201).and().contentType(ContentType.JSON).extract().response();
		//It is status code 201 because that means it created the issue according to the API
		String outres = create.asString();
		System.out.println(outres);
	}
	
	@Step
	public void addComment(String jirahost) {
		//Creating Issue/Defect
		Response res=given().header("Content-Type", "application/json").
				header("Cookie","JSESSIONID="+Resources.getJIRAKey(jirahost)).
				pathParam("commentid", "10006").
				body("{ \"body\": \"Inserting comment from the automation code\","+
						"\"visibility\": {"+
						"\"type\": \"role\","+
						"\"value\": \"Administrators\" }"+
						"}").when().
				post("/rest/api/2/issue/{commentid}/comment/").then().statusCode(201).extract().response();
		//JsonPath js= GenericMethods.rawToJson(res);
		String id = res.path("id"); //extract id value from the response
		System.out.println(id);
	}
}
