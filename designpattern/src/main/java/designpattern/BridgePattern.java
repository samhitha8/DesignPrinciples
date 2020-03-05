package designpattern;
class midmarks{
	void total()
	{
		System.out.println("It gives the total");
	}
	void percentage()
	{
		System.out.println("It gives the percentage");
	}
}
class ranking extends midmarks{
	void toppers() {
		System.out.println("The top 10 toppers are segregated from the list");
	}
}
public class BridgePattern extends ranking {
public static void main(String[] args) {
	ranking object=new ranking();
	object.total();
	object.percentage();
	object.toppers();

	}

}
