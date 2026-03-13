class PhonePayRunner
{
	public static void main(String args[])
	{
		double price = PhonePay.searchinsurancePremium("Hdfc");
		System.out.println(price);

		double amount = PhonePay.searchinsurancePremium("star");
		System.out.println(amount);

		double ruppee = PhonePay.searchinsurancePremium("Aditya birla");
		System.out.println(ruppee);

		double amnt = PhonePay.searchinsurancePremium("icici lombard");
		System.out.println(amnt);

		double ref = PhonePay.searchinsurancePremium("care health");
		System.out.println(ref);

		double amt = PhonePay.searchinsurancePremium("acko");
		System.out.println(amt);
	}
}