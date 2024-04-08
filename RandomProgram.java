import java.util.Arrays;
class GitAssignment {
    public static void main(String[] args) {
        System.out.println("Hello, Git"); 

        int arr[] = { 12, 3, 4, 15 };

        Arrays.sort(arr);
        System.out.println("\nThe sorted version of the array is: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        String randomWords[] = { "lebron", "test", "amazing", "two words" };

        Arrays.sort(randomWords);
        System.out.println("\nThe sorted version of the string array is: ");
        for (String list: randomWords) {
            System.out.println(list + " "); //testcomment
        }
 
    }
}