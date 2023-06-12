import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String substring = sc.nextLine();

        //String[] parts = string.split("");

        int index = 0;
        int count = 0;

        while (true) {
            index = string.indexOf(substring, index);
            if (index != -1) {
                count++;
                index += substring.length(); // I guess we add so that won't be counted again

            } else {
                break;
            }
        }
        System.out.println(count);
    }
}