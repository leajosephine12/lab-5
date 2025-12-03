package example;

import java.io.IOException;

/**
 * Class for getting your Grade API token.
 */
public class GetToken {

    /**
     * Run to get your token after you complete the code.
     *
     * @param args unused arguments
     */
    public static void main(String[] args) throws IOException {
        GetExample example = new GetExample();

        String gradeAPISignUpURL = "https://grade-apis.panchen.ca/signUp";
        String userName = "leaPalme1245";
        String response = example.run(gradeAPISignUpURL, "username", userName);
        // response = example.run( ...)
        System.out.println(response);
    }
}