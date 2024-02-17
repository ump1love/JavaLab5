import java.util.Scanner;

class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean pin_code_coincided = false;
        while (counter != 5){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;
            if(correct.equals(vasya)){
                System.out.println("СORRECT");
                pin_code_coincided = true;
                break;
            }
            System.out.println("INCORRECT " + counter);
        }
        if (!pin_code_coincided){
            System.out.println("Error");
        }
    }
}