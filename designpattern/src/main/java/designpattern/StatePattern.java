package designpattern;

public class StatePattern{
   public static void main(String[] args) {
      Fruit object = new Fruit(new getcolour(),"Grapes");
      Fruit object1 = new Fruit(new colourcode(),"Apple");
      object.colour();
      object1.colour();
}
}

class Fruit
 {private body reference;
     String name;
	    Fruit(body ref, String p) {
	      super();
	      this.reference = ref;
	      this.name = p;
	    }
	    public void colour() {
reference.colour();
	    }
	}
 interface body {
	   public void colour();
	}
	 class getcolour implements body {
	   public void colour() {
	      System.out.println("This fuit is green in colour.");
	   }
	}

	 class colourcode implements body {
	   public void colour() {
	      System.out.println("Thi fruit is in red colour.");

	   }
	}
