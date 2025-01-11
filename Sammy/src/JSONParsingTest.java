import java.io.IOException;
import java.nio.file.*;
import org.json.JSONObject;


public class JSONParsingTest {

    public static void main(String s[]) throws IOException {


        String content = new String(Files.readAllBytes(Paths.get("Sammy/src/sample.json")));
        JSONParser parser = new JSONParser();
        JSONObject jo =

    }
}
