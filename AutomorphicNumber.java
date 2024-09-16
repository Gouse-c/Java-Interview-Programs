import java.util.Scanner;
class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int orgNum = num;
        int square = num * num;
        boolean isAutomorphic = true;

        while (orgNum != 0) {
            if (orgNum % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            orgNum = orgNum / 10;
            square = square / 10;
        }
        if (isAutomorphic) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
        sc.close();
    }
}
