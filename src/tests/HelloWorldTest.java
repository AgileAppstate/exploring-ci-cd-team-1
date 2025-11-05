import java.io.*;

public class HelloWorldTest {
    public static void main(String[] args) throws Exception {
        // Capture output of HelloWorld.main()
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the HelloWorld class
        HelloWorld.main(new String[]{});

        // Restore original System.out
        System.setOut(originalOut);

        // Get and trim the captured output
        String output = outputStream.toString().trim();

        // Check if output matches expected
        String expected = "Hello World!";
        if (output.equals(expected)) {
            System.out.println("✅ Test passed! Output: " + output);
        } else {
            System.out.println("❌ Test failed!");
            System.out.println("Expected: \"" + expected + "\"");
            System.out.println("Got: \"" + output + "\"");
            System.exit(1);
        }
    }
}