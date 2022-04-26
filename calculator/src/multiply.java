import java.util.Scanner;
public class multiply {
    public static Scanner inp = new Scanner(System.in);

    double num1, num2, calc;
    int result;    
    void gun(){
        
        System.out.print("Enter The First Number : ");
        num1 = inp.nextDouble();
        System.out.print("Enter The Second Number : ");
        num2 = inp.nextDouble();
        calc = num1 * num2;
        result = (int) calc;
        
        System.out.print("The Sum Is "+result);
        

    }
}
