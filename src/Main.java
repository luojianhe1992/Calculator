
public class Main {
	public static void main(String[] args) {
		System.out.println(myLog(2, 1.0*36/5));
		
		double sum = 0;
		sum += myLog(2, 1.0*36)/36;
		sum += myLog(2, 1.0*18)/18;
		sum += myLog(2, 1.0*12)/12;
		sum += myLog(2, 1.0*9)/9;
		sum += myLog(2, 1.0*36/5)*5/36;
		sum += myLog(2, 1.0*6)/6;
		sum += myLog(2, 1.0*36/5)*5/36;
		sum += myLog(2, 1.0*9)/9;
		sum += myLog(2, 1.0*12)/12;
		sum += myLog(2, 1.0*18)/18;
		sum += myLog(2, 1.0*36)/36;
		System.out.println(sum);
		
		System.out.println("**************");
		
		double sum2 = 0;
		sum2 += myLog(2, 0.525/0.025)*0.025/0.525;
		sum2 += myLog(2, 0.525/0.3)*0.3/0.525;
		sum2 += myLog(2, 0.525/0.2)*0.2/0.525;
		System.out.println("sum2 ="+sum2);
		
		System.out.println("**************");
		
		double sumAll = 0;
		
		double sum3 = 0;
		sum3 += myLog(2, 0.175/0.15)*0.15/0.175;
		sum3 += myLog(2, 0.175/0.025)*0.025/0.175;
		sum3 += 0;
		
		System.out.println("sum3 ="+sum3);
		
		double sum4 = 0;
		sum4 += myLog(2, 0.525/0.025)*0.025/0.525;
		sum4 += myLog(2, 0.525/0.3)*0.3/0.525;
		sum4 += myLog(2, 0.525/0.2)*0.2/0.525;
		
		double sum5 = 0;
		sum5 += 0;
		sum5 += myLog(2, 0.3/0.1)*0.1/0.3;
		sum5 += myLog(2, 0.3/0.2)*0.2/0.3;
		
		sumAll = sum3*0.175 + sum4*0.525 + sum5*0.3;
		
		System.out.println(sumAll);
		
		System.out.println(1.4492 - 1.0095);
		
		System.out.println("**********************");
		
		System.out.println(myLog(2, 1/0.3));
		
		System.out.println(0.5146 * 0.7 + 1.7370 * 0.3);
		
		System.out.println(myLog(4, 16));
		
		System.out.println(myLog(2, 36*1.0/5));
		
		System.out.println("******************");
		
		double sum7 = 0;
		sum7 += myLog(2, 1.0*1/0.175)*0.175/1;
		sum7 += myLog(2, 1.0*1/0.525)*0.525/1;
		sum7 += myLog(2, 1.0*1/0.3)*0.3/1;
		
		System.out.println("sum7 = "+sum7);
		System.out.println("*************************");
		
		System.out.println(euclideanDistance(4.7, 3.2, 1.3, 0.2, 5.7, 3, 4.2, 1.2));
		
	}
	
	public static double myLog(double a, double b)
	{
		double result;
		
		double fenMu = Math.log10(b);
		double fenZi = Math.log10(a);
		
		result = fenMu/fenZi;
		
		return result;
	}
	
	public static double euclideanDistance(double f11, double f12, double f13, double f14,
			double f21, double f22, double f23, double f24){
		double result = 0;
		
		result += Math.pow(f11 - f21, 2);
		
		System.out.println("result = "+result);
		
		result += Math.pow(f12 - f22, 2);
		
		System.out.println("result = "+result);
		
		result += Math.pow(f13 - f23, 2);
		
		System.out.println("result = "+result);
		
		result += Math.pow(f14 - f24, 2);
		
		System.out.println("result = "+result);
		
		result = Math.sqrt(result);
		
		System.out.println("result = "+result);
		
		return result;
	}
}
