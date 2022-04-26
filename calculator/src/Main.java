import java.util.Scanner;
public class Main{

    /**
     * This Calculator Was Created By Emperor Hacker's Community For Demo Purpose
     * Credit: Emperor Hacker's Community
     */
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------------------------------------------------------");
        
        System.out.println("|                                    Welcome To Emperor Calculator                                   |");

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println(" What you want to do?");
        System.out.println(" [1] Sum ");
        System.out.println(" [2] Sub ");
        System.out.println(" [3] Multiply ");
        System.out.println(" [4] Divided ");

        System.out.print("Enter The Number : ");
        int input = read.nextInt();

        if(input == 1){
            sum db = new sum();
            db.jog();
            read.close();
            
        }else if(input ==2){
            sub db1 = new sub();
            db1.biyog();
            read.close();
        }else if(input == 3){
            multiply db2 = new multiply();
            db2.gun();
            read.close();
        }else if( input == 4){
            divided db3 = new divided();
            db3.vag();
            read.close();
        }else{
            System.out.println("Syntax Error !!!");
            read.close();
        }

    
        
    }
        
    }