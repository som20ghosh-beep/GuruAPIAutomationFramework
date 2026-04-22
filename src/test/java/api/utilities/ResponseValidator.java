package api.utilities;

import org.testng.Assert;

import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;

public class ResponseValidator {

    // Validate status code (supports multiple expected values)
	public static void validateStatus(Response res, int... expectedCodes) {

	    int actual = res.getStatusCode();
	    boolean isValid = false;

	    for (int code : expectedCodes) {
	        if (code == actual) {
	            isValid = true;
	            break;
	        }
	    }

	    Assert.assertTrue(isValid, "Invalid status: " + actual);
	}

    //  Validate response time
    public static void validateResponseTime(Response res, long maxTime) {
        Assert.assertTrue(
                res.getTime() < maxTime,
                "Response too slow: " + res.getTime()
        );
    }

    //  Validate field is not null
    public static void validateFieldNotNull(Response res, String path) {
        Assert.assertNotNull(
                res.jsonPath().get(path),
                path + " is null"
        );
    }

    //  Validate list is not empty
    public static void validateListNotEmpty(Response res, String path) {
        
    	List<?> list = res.jsonPath().get(path);
        
     //  Prevent NullPointerException
       Assert.assertNotNull(list, "List is null for path: " + path);
        
        Assert.assertFalse(list.isEmpty(),path + " is empty");
    }

    //  Validate field equals expected value
    public static void validateFieldEquals(Response res, String path, Object expected) {
        Assert.assertEquals(
                res.jsonPath().get(path),
                expected,
                "Mismatch at " + path
        );
    }
    
    //Exact TotalCount value validation
    public static void validateTotalCount(Response res, int expectedCount) {
    	
    	Assert.assertEquals(res.jsonPath().getInt("Data.TotalCount"), expectedCount,    "TotalCount mismatch");
    }
    
    //  TotalCount is not zero
    public static void validateTotalCountNotZero(Response res) {
    	Assert.assertEquals(res.jsonPath().getInt("Data.TotalCount")>0, "TotalCount is zero");
    }
    

    //SenderId is not null
    public static void validateSenderIDNotNull(Response res, String jsonPth) {
    	Assert.assertNotNull(res.jsonPath().get(jsonPth), "SenderID is null");
    }
    
    //Validate the project/Job Name
    public static void validateProjectName(Response res, String jsonPath, String expectedName) {
    	Assert.assertEquals(res.jsonPath().getString(jsonPath), expectedName, "Project name mismatch");
    }
}