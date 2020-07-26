
import java.util.*;
import java.util.logging.Logger; 

class Computation {
	double principal, rateOfInterest, TimePeriod;
	
	Computation(double principal, double rateOfInterest, double TimePeriod){
		this.principal = principal;
		this.rateOfInterest = rateOfInterest;
		this.TimePeriod = TimePeriod;
	}
	
	double calculateCompoundInterest() {
		return (principal * (Math.pow(1 + rateOfInterest / 100, TimePeriod)));
	}

	double CalculateSimpleInterest() {
		return (principal * rateOfInterest * TimePeriod) / 100;
	}

}

public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		Logger log=Logger.getLogger(Interest.class.getName());
		
		System.out.format("%s", "Enter principle amount");
		double principal = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rateOfInterest = sc.nextDouble();
		System.out.format("%s", "Enter number of years");
		double TimePeriod = sc.nextDouble();
		
		Computation com = new Computation(principal, rateOfInterest, TimePeriod);
		
		log.info("1)Select This option for Calculating Simple Interest 2)Select This option for Calculating Compound Interest");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			log.info(String.valueOf(com.CalculateSimpleInterest()));
			break;
		case 2:			
			log.info(String.valueOf(com.calculateCompoundInterest()));
			break;
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
