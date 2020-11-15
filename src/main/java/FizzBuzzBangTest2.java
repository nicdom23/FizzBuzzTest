public class FizzBuzzBangTest2 {
    public static void main(String[] args) {
        for(int i = 0; i< 106 ; i++) {
            String s = "";
            if (i % 5 != 0 && i % 3 != 0 && i % 7 != 0)
                System.out.println(i);
            if (i % 3 == 0) {
                s = s + "Fizz";
            }
            if (i % 5 == 0) {
                s = s + "Buzz";
            }
            if (i % 7 == 0) {
                s = s + "Bang";
            }
            System.out.println(s);
        }
    }
}
