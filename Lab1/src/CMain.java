
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class CMain {
	public static void Main(String[] args) {
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		double PV;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of Annual Return1");
		double AR1 = input.nextDouble();
		System.out.println("Enter a number of Years Retired");
		double YR = input.nextDouble();
		System.out.println("Enter a number of Required Income");
		Double RI = input.nextDouble();

		r = (AR1 / 12);
		n = YR * 12;
		y = RI - 2642;
		f = 0;
		t = false;

		PV = FinanceLib.pv(r, n, y, f, t);

		System.out.println(PV);

		double PMT;

		System.out.println("Enter a number of Annual Return2");
		Double AR2 = input.nextDouble();
		System.out.println("Enter a number of Years to Work");
		Double YW = input.nextDouble();

		r = (AR2 / 12);
		n = YW * 12;
		p = 0;
		f = PV;
		t = false;

		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);
	}

}
