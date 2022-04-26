import java.util.Scanner;

public class sum {
    
    public static Scanner inp = new Scanner(System.in);

    double num1, num2, calc;
    int result;    
    void jog(){
        
        System.out.print("Enter The First Number : ");
        num1 = inp.nextDouble();
        System.out.print("Enter The Second Number : ");
        num2 = inp.nextDouble();
        calc = num1 + num2;
        result = (int) calc;
        
        System.out.print("The Sum Is "+result);
        

    }


}
