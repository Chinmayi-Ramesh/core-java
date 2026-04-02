class BrowserExec{
	public static void main(String args[])
	{
		Browser b = new Browser();
		b.browserId = 1;
		b.name = "Chrome";
		b.company= "Google";
		b.version = "1.2.01";
		b.isSecured = true;
		b.isAiIntegrated = true;
		Internet i = new Internet();
		b.internet = i;
		i.internetId = 1;
		i.speed = "25mbps";
		b.display();
		
		System.out.println();
		Browser b2 = new Browser();
		b2.browserId = 2;
		b2.name = "edge";
		b2.company = "Microsoft";
		b2.version = "1.2.04";
		b2.isSecured = true;
		b2.isAiIntegrated = false;
		Internet i2 = new Internet();
		b2.internet = i2;
		i2.internetId = 2;
		i2.speed = "20mbps";
		b2.display();
	}
}