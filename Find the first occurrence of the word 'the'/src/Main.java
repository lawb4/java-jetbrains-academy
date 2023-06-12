import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        System.out.println(line.toLowerCase().indexOf("the"));

        /*char[] s = sc.nextLine().toLowerCase().toCharArray();

        for (int i = 0; i < s.length - 2; ++i) {
            if (s[i] == 't' && s[i + 1] == 'h' && s[i + 2] == 'e') {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);*/
    }
}