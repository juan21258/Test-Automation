package files;

public class Payload {
	
	public static String getPostData() {
		String b = "{\r\n" + 
				" \r\n" + 
				"    \"location\":{\r\n" + 
				" \r\n" + 
				"        \"lat\" : -39.383494,\r\n" + 
				" \r\n" + 
				"        \"lng\" : 34.427362\r\n" + 
				" \r\n" + 
				"    },\r\n" + 
				" \r\n" + 
				"    \"accuracy\":50,\r\n" + 
				" \r\n" + 
				"    \"name\":\"Frontline warehouse\",\r\n" + 
				" \r\n" + 
				"    \"phone_number\":\"(+91) 983 893 3937\",\r\n" + 
				" \r\n" + 
				"    \"address\" : \"30, side layout, cohen 09\",\r\n" + 
				" \r\n" + 
				"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
				" \r\n" + 
				"    \"website\" : \"http://google.com\",\r\n" + 
				" \r\n" + 
				"    \"language\" : \"French-IN\"\r\n" + 
				" \r\n" + 
				"}\r\n" + 
				"";
		return b;
	}
	
	public static String targetPlace(String p) {
		String place = "{"+
				  "\"place_id\": \""+p+"\""+
				  "}";
		return place;
	}
	
	public static String addBook(String isbn, String aisle) {
		String book = "[\r\n" + 
				"    {\r\n" + 
				"        \"book_name\": \"Learn Appium Automation with Java\",\r\n" + 
				"        \"isbn\": \"" + isbn + "\",\r\n" + 
				"        \"aisle\": \"" + aisle + "\",\r\n" + 
				"        \"author\": \"John foe\"\r\n" + 
				"    }\r\n" + 
				"]";
		return book;
	}
}
