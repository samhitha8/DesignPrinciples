package designpattern;
interface transport{
	abstract void cost();
	abstract void time();
}
class buses implements transport{
	public void cost()
	{
		System.out.println("It is cheap");
	}
	public void time()
	{
		System.out.println("Bus takes really long time compared to other means of transport");
	}
}
class trains implements transport{
	public void cost()
	{
		System.out.println("It is less cost");
	}
	public void time()
	{
		System.out.println("Trains take more time than planes");
	}
}
class aeroplane implements transport{
public 	void cost()
	{
		System.out.println("It is cheap");
	}
public	void time()
	{
		System.out.println("Bus takes really long time compared to other means of transport");
	}
}
public class factory  {
	public static void main(String args[])
	{
		System.out.println("BUS INFORMATION:-\n");
	buses busesobject= new buses();
	busesobject.time();
	busesobject.cost();
	System.out.println("TRAIN INFORMATION:-\n");
	trains trainsobject= new trains();
	trainsobject.time();
	trainsobject.cost();
	System.out.println("AEROPLANE INFORMATION:-\n");
	aeroplane planeobject= new aeroplane();
	planeobject.time();
	planeobject.cost();
	}

}
