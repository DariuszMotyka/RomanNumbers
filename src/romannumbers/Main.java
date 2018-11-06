package romannumbers;

public class Main {

	public static void main(String[] args) {
		Calculate calculator = new Calculate();
		
		String roman;
		 
		roman = calculator.arabic2roman(1981);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(1);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(3);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(4);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(5);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(6);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(45);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
		roman = calculator.arabic2roman(68);
		System.out.println(calculator.roman2arabic(roman) + " = " +  roman);
	}

}
