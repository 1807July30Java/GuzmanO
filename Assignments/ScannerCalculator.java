package com.revature.assignments;

public class ScannerCalculator {
	
	public static void calculate(String type, String operation, String n1, String n2) {
		// TODO Auto-generated method stub
		try {
			if(type.equals("byte")) {
				byte num1 = Byte.parseByte(n1);
				byte num2 = Byte.parseByte(n2);
				
				if(operation.equals("add")) {
					byte result = (byte) (num1 + num2);
					System.out.println("result = " + result);
				}
				else if (operation.equals("subtract")) {
					byte result = (byte) (num1 - num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("divide")) {
					byte result = (byte) (num1 / num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("multiply")) {
					byte result = (byte) (num1 * num2);
					System.out.println("result = " + result);
				}
				else {
					System.out.println("Error, not an operation");
				}
				
			}
			else if (type.equals("short")) {
				short num1 = Short.parseShort(n1);
				short num2 = Short.parseShort(n2);
				
				if(operation.equals("add")) {
					short result = (short) (num1 + num2);
					System.out.println("result = " + result);
				}
				else if (operation.equals("subtract")) {
					short result = (short) (num1 - num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("divide")) {
					short result = (short) (num1 / num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("multiply")) {
					short result = (short) (num1 * num2);
					System.out.println("result = " + result);
				}
				else {
					System.out.println("Error, not an operation");
				}
				
			}
			else if (type.equals("int")) {
				int num1 = Integer.parseInt(n1);
				int num2 = Integer.parseInt(n2);
				
				if(operation.equals("add")) {
					int result = (int) (num1 + num2);
					System.out.println("result = " + result);
				}
				else if (operation.equals("subtract")) {
					int result = (int) (num1 - num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("divide")) {
					int result = (int) (num1 / num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("multiply")) {
					int result = (int) (num1 * num2);
					System.out.println("result = " + result);
				}
				else {
					System.out.println("Error, not an operation");
				}
			}
			else if (type.equals("long")) {
				long num1 = Long.parseLong(n1);
				long num2 = Long.parseLong(n2);
				
				if(operation.equals("add")) {
					long result = (long) (num1 + num2);
					System.out.println("result = " + result);
				}
				else if (operation.equals("subtract")) {
					long result = (long) (num1 - num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("divide")) {
					long result = (long) (num1 / num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("multiply")) {
					long result = (long) (num1 * num2);
					System.out.println("result = " + result);
				}
				else {
					System.out.println("Error, not an operation");
				}
			}
			else if (type.equals("float")) {
				float num1 = Float.parseFloat(n1);
				float num2 = Float.parseFloat(n2);
				
				if(operation.equals("add")) {
					float result = (float) (num1 + num2);
					System.out.println("result = " + result);
				}
				else if (operation.equals("subtract")) {
					float result = (float) (num1 - num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("divide")) {
					float result = (float) (num1 / num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("multiply")) {
					float result = (float) (num1 * num2);
					System.out.println("result = " + result);
				}
				else {
					System.out.println("Error, not an operation");
				}
			}
			else if (type.equals("double")) {
				double num1 = Double.parseDouble(n1);
				double num2 = Double.parseDouble(n2);
				
				if(operation.equals("add")) {
					double result = (double) (num1 + num2);
					System.out.println("result = " + result);
				}
				else if (operation.equals("subtract")) {
					double result = (double) (num1 - num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("divide")) {
					double result = (double) (num1 / num2);
					System.out.println("result = " + result);
				}
				else if(operation.equals("multiply")) {
					double result = (double) (num1 * num2);
					System.out.println("result = " + result);
				}
				else {
					System.out.println("Error, not an operation");
				}
			}
			
		} catch(ArithmeticException e) {
			e.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
