class PlaystoreExec{
	public static void main(String args[])
	{
		Playstore p = new Playstore();
		p.playstoreId = 1;
		
		Application app = new Application();
		p.app =app;
		app.applicationId = 1;
		app.version = "1.2.01";
		app.downloads = "14610145";
		app.updatedOn = "01-04-2026";
		app.releasedOn = "31-03-2026";
		app.requiredOS = "Windows ";
		app.ratings = 4.6f;
		app.type = "Game";
		p.getDetails();
	}
}