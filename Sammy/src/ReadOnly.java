import java.nio.file.*;

public class ReadOnly {

    public static void main(String args[]) throws Exception {

        String read = Files.readString(Path.of("sample.json"));

        System.out.println(read);
    }
}
