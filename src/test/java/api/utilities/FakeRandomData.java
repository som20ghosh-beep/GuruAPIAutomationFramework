package api.utilities;

import com.github.javafaker.Faker;

public class FakeRandomData {

	static Faker faker = new Faker();

    public static String getTemplateName() {
        return faker.commerce().productName();
    }

    public static String getContent() {
        return faker.lorem().sentence();
    }
    
}
