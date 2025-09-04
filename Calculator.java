import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int choice1;
        while (true){
            while (true){    
                
                System.out.println("********************");
                System.out.println("1. ADD TWO NUMBERS.");
                System.out.println("2. SUBTRACT TWO NUMBERS.");
                System.out.println("3. MULTIPLY TWO NUMBERS.");
                System.out.println("4. DIVIDE TWO NUMBERS.");
                System.out.println("********************");
                System.out.print("ENTER YOUR CHOICE BY PROVIDING THE NUMBER ASSIGNED TO THEM : ");
                int choice = input.nextInt();
                if (choice==1 || choice==2 ||choice==3 || choice==4){
                    choice1=choice;
                    break;
                }
                else{
                    System.out.println("YOU ENTERED WRONG INPUT ENTER A VALID CHOICE...");
                    System.out.println();
                    continue;
                }
            }
            switch (choice1) {
                case 1:
                    System.out.print("ENTER FIRST VALUE : ");
                    int a=input.nextInt();
                    System.out.print("ENTER ANOTHER VALUE : ");
                    int b=input.nextInt();
                    System.out.println("THE ANSWER OF THE GIVEN INPUT IS : "+ (a+b));
                    break;
                case 2:
                    System.out.print("ENTER FIRST VALUE FOR SUBTRACTION : ");
                    int C=input.nextInt();
                    System.out.println("ENTER ANOTHER VALUE FOR SUBTRACTION : ");
                    int D=input.nextInt();
                    System.out.println("THE ANSWER OF THE GIVEN INPUT IS : "+ (C-D));
                    break;
                case 3:
                    System.out.print("ENTER FIRST VALUE FOR MULTIPLICATION : ");
                    int E=input.nextInt();
                    System.out.println("ENTER ANOTHER VALUE FOR MULTIPLICATION : ");
                    int F=input.nextInt();
                    System.out.println("THE ANSWER OF THE GIVEN INPUT IS : "+ (E*F));
                    break;
                case 4:
                    System.out.print("ENTER FIRST VALUE FOR DIVISION: ");
                    int G=input.nextInt();
                    System.out.println("ENTER ANOTHER VALUE FOR DIVISION: ");
                    int H=input.nextInt();
                    System.out.println("THE ANSWER OF THE GIVEN INPUT IS : "+ (G/H));
                    break;
                }  
                 
                System.out.print("DO YOU WANT TO CONTINUE(Y/N) : ");
                input.nextLine();
                String finalise = input.nextLine();
                if (finalise.equalsIgnoreCase("yes")){
                    continue;
                }
                else if (finalise.equalsIgnoreCase("no"))
                {
                    System.out.println("GOODBYE");
                    break;
                }
            }
                input.close();
    }
}