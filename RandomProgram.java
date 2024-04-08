import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Git"); 

        
        String randomWords[] = { "lebron", "test", "amazing", "two words" };

        Arrays.sort(randomWords);
        System.out.println("\nThe sorted version of the string array is: ");
        for (String list: randomWords) {
            System.out.println(list + " ");
        }
 
    }
}