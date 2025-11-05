public class HelloWorldTest {
    public static void main(String[] args) {
        String result = HelloWorld.sayHello();
        assert result.equals("Hello World!") : "Test failed!";
        System.out.println("All tests passed!");
    }
}
