import java.util.Scanner;
class mat{
    public static void main(String []args){
        int a=10;
        int b=76;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an operator(+,-,*,/):");
        String operator=scanner.next();
        switch (operator){
            case "+":
                System.out.println(+(a+b));
                break;
            case "-":
                System.out.println(+(a-b));
                break;
            case "*":
                System.out.println(+(a*b));
                break;
            case "/":
                System.out.println(+(a/b));
                break;
            default:
                System.out.println("Enter a valid operator!");    
        }
        scanner.close();

    }
}