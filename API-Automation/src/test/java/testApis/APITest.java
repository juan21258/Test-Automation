package testApis;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import org.junit.Before;
import org.junit.Test;
//import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import com.tngtech.java.junit.dataprovider.DataProvider;
import apiAutomation.Basics;
import files.Payload;

@RunWith(SerenityRunner.class)
//@RunWith(JUnitParamsRunner.class)
public class APITest {
	String host,jirahost;
	
	//@Before
	public void getData() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\juan.perez\\eclipse-workspace\\API-Automation\\src\\main\\java\\files\\env.properties");
		prop.load(fis);
		host = prop.getProperty("HOST");
		jirahost = prop.getProperty("HOSTJIRA");
	}
	
	//@Steps
	//JiraAPI jiraApi;
	
	@Steps
	Basics basics;
	
	@Test
	public void postTest() {
		basics.postData();
	}
	
	@Test
	public void getTest() {
		basics.getPreguntas();
	}
	
	/*
	@Test
	public void post2Test() {
		basics.grabAndDeletePlace(host);
	}
	
	@Test
	public void postXML() throws IOException {
		basics.postXML();
	}*/
	
	/*
	@Test
	public void jiraTest() {
		jiraApi.createIssue(jirahost);
	}
	
	@Test
	public void jiraComment() {
		jiraApi.addComment(jirahost);
	}*/
	
	//@Test
	@Parameters(method = "provideData")
	public void bookTest(String isbn, String aisle) {
		given().baseUri("http://216.10.245.166").
		header("Content-Type","application/json").
		body(Payload.addBook(isbn,aisle)).when().
		post("/Library/Addbook.php").
		then().assertThat().statusCode(200).extract().response();
		System.out.println("ISBN: "+isbn + " AISLE: "+aisle);
	}
	
	@DataProvider()
	public Object[][] provideData() {
	    return new Object[][] {{ "sixes", "3645" },{ "Foo", "132" }};
	}
}
