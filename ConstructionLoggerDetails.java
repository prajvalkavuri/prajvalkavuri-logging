package logger;
import java.util.Scanner;
import java.util.logging.Logger; 
public class ConstructionLoggerDetails {
	static
	{
		Logger log=Logger.getLogger(ConstructionLoggerDetails.class.getName());
		Scanner sc=new Scanner(System.in);
		int materialQuality,area;
		String logMsg;
		log.info("Enter Material Quality\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		materialQuality=sc.nextInt();
		if(materialQuality==1||materialQuality==2||materialQuality==3||materialQuality==4)
		{
			log.info("Enter the Area of the house in sq.ft");
			area=sc.nextInt();
			ConstructionDetails conn=new ConstructionDetails(materialQuality,area);
			logMsg=conn.CalculationOfCost();
			log.info(logMsg);
		}
		else
		{
			log.info("Invalid input");
			System.exit(0); 
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}