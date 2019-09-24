package files;

import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;

public class GenericMethods {
	
	public static JsonPath rawToJson(Response res) {
		String outres = res.toString();
		//convert response into JSON
		JsonPath js = new JsonPath(outres);
		return js;
	}
	
	public static XmlPath rawToXml(Response res) {
		String xmlresponse = res.toString();
		//convert response into XML
		XmlPath xml = new XmlPath(xmlresponse);
		return xml;
	}
}
