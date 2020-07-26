package logging;
public class ConstructionDetails
{
	int standard,Area;
	ConstructionDetails(int std,int area)
	{
		standard=std;
		Area=area;
	}
	String CalculationOfCost()
	{
		if(standard==1)
			return("Cost of Construction: "+Area*12000);
		else if(standard==2)
			return("Cost of Construction: "+Area*15000);
		else if(standard==3)
			return("Cost of Construction:"+Area*18000);
		else if(standard==4)
			return("Cost of Construction:"+Area*25000);
		else
			return("invalid");
	}
}