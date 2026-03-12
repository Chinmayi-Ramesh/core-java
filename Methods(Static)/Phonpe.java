class PhonePay
{
	static double searchinsurancePremium(String insuranceName)
	{
		System.out.println("Searching premium insurance ");

		if(insuranceName == "Hdfc")
		{
			System.out.println(" HDFC Premium insurance amount is ");
			return 87945.98;
		}
		else if(insuranceName == "star")
		{
			System.out.println(" star Premium insurance amount is ");
			return 7812.23;
		}
		else if(insuranceName == "Aditya birla")
		{
			System.out.println(" Aditya birla Premium insurance amount is ");
			return 7895.21;
		}
		else if(insuranceName == "icici lombard")
		{
			System.out.println(" icici Premium insurance amount is ");
			return 7546.23;
		}
		else if(insuranceName == "care health")
		{
			return 7426.23;
		}
		else if(insuranceName == "acko")
		{
			return 7624.12;
		}
		else if(insuranceName == "bajaj")
		{
			return 7482.13;
		}
		else
		{
			System.out.println("you are searching insurance is not found");
		}

		return 0.0;
	}
}