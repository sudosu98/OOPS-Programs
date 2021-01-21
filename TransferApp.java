class TransferMarket
{
	public TransferMarket(String club1, String club2)
	{
		System.out.println("Team : "+club1);
		System.out.print("To");
		System.out.println("Team : "+club2);
	}
	String name = "Cristiano";
	int jersey_No = 7;
	public void Transfer()
	{
		System.out.println("New Transfer");
	}
}
class Club extends TransferMarket
{
	public Club()
	{
		super("Real Madrid","Juventus");
	} 
	String l_name = "Ronaldo";
	public void PlayerName()
	{
		System.out.println("Player Name : "+name+" "+l_name);
		System.out.println("Jersey Number :"+jersey_No);
	}
}
class TransferApp
	{
	public static void main(String[] args)
	{
	Club ref = new Club();
	ref.Transfer();
	ref.PlayerName();
	}
}