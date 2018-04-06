package Section04;

import java.util.Scanner;

public class S23 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        
        //collect employee data
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hours = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate e.g 20 for 20%: ");
        int fedRate = input.nextInt();
        System.out.print("Enter state tax withholding rate e.g 10 for 10%: ");
        int stateRate = input.nextInt();
        
        //calculate employee gross pay and net pay
        double grossPay = hours * rate;
        double fedWithHolding = ((fedRate/100.0) * grossPay);
        double stateWithHolding = ((stateRate/100.0) * grossPay);
        double totalDeduction = fedWithHolding + stateWithHolding;
        double netPay = grossPay - totalDeduction;
        
        //format netPay to two decimal places
        netPay = (int)(netPay * 100)/100.0;
        
        //print payroll
        System.out.println("\n\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("  Federal Withholding (" + (double)fedRate + "%): $" + fedWithHolding);
        System.out.println("  State Withholding (" + (double)stateRate + "%): $" + stateWithHolding);
        System.out.println("  Total Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
	}

}
