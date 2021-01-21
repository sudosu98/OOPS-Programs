 class TransferMarket
{
    String name;
    String contract;
    String base_price;
    String salary;
    String position;
    String club;
    public TransferMarket(String club,String name,String contract,String base_price,String salary,String position)
    {
        this.club = club;
        this.name=name;
        this.contract = contract;
        this.base_price = base_price;
        this.salary = salary;
        this.position = position;
    }
    public void CurrentClub()
    {
        System.out.println("Current Club :"+club);
    }
}
 class Transfer extends TransferMarket
{
    String newclub;
    String offer;
    String newsalary;
    String newcontract;
    public Transfer(String newclub ,String offer,String newsalary,String newcontract)
    {
        super("Real Madrid","Cristiano Ronaldo","4 Years until 2021","$ 80 Million","$400,000/Week","LW");
        this.newclub = newclub;
        this.offer = offer;
        this.newsalary = newsalary;
        this.newcontract = newcontract;
    }
    public void TransferDetail()
    {
        System.out.println("Player Name :"+name);
        System.out.println("Current Contract : "+contract);
        System.out.println("Market Value : "+base_price);
        System.out.println("Weekly Wage : "+salary);
        System.out.println("Player Position : "+position);
        System.out.println("Transfer Club : "+newclub);
        System.out.println("Transfer Offer : "+offer);
        System.out.println("Offered Weekly Wages : "+newsalary);
        System.out.println("Offered Contract Duration : "+newcontract);
    }
}
public class TheDailyTransfer
 {
    public static void main(String[] args) 
    {
        Transfer tm = new Transfer("Juventus","$ 90 Million","550,000/Week","3 years");
        tm.CurrentClub();
        tm.TransferDetail();
    }
}
