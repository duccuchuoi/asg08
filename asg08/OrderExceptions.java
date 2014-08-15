//cau 4: Bat nhieu ngoai le
import java.util.*;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;
public class OrderExceptions{
     public static void main(String[] args){
	
	    Scanner scanner = new Scanner(System.in);
	 try{	
		System.out.println("Numeral :");
		int numeral = scanner.nextInt();
		
		System.out.println("Denominator :");
		int demo = scanner.nextInt();
		
		int result = numeral/demo;
		System.out.printf("\n Result : %d / %d = %d",numeral,demo,result);
		}
	catch (InputMismatchException e) {
        System.out.println("Invalid input !");
		}
    catch (IOException e) {
        System.out.println("Some input or output error !");
		}
	catch (Exception e)   {
        System.out.println("Some error !");
        }
    }
}	
		