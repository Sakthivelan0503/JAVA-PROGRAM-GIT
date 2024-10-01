import java.util.Scanner;

 class letter {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        StringBuilder output = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                output.append(currentChar);
                output.append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        output.append(currentChar);
        output.append(count);

        System.out.println(output.toString());
    }
}
