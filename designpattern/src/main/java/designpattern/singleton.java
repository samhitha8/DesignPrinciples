package designpattern;

class government{
	void print() {
	System.out.println("hi government");}
}
class ruling extends government{
	void show() {
		System.out.println("currently _____party is ruling");
	}
}
public class singleton extends ruling{

	public static void main(String[] args) {
		singleton s=new singleton();
		s.print();
		s.show();

	}

}
