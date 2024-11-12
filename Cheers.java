// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0].toUpperCase();
                int times = Integer.parseInt(args[1]);
                // array of chars

                char[] specialLetters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'}; 
                for (int i = 0; i < name.length(); i++) {
                        char currentChar = name.charAt(i);
                        boolean isSpecial = false;
                        for (int j = 0; j < specialLetters.length; j++) {
                                if (currentChar == specialLetters[j]) {
                                        isSpecial = true;
                                        break;
                                } 
                        }
                        System.out.print("Give me a");
                        if (isSpecial) {
                                System.out.print("n");
                        } else{
                                System.out.print(" ");
                        }
                        System.out.println(" " + currentChar + ": " + currentChar + "!");
                }      
                System.out.println("What does that spell?"); 
                for (int i = 0; i < times; i++) {
                        System.out.println(name + "!!!");
                }
        }
}
