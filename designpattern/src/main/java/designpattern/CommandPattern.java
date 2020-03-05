package designpattern;
interface Command {
    void execute();
}
class Principal implements Command {
    public void execute() {
        System.out.println("Takes care of the displine.");
    }
}
class Administrater implements Command {
    public void execute() {
        System.out.println("Takes care of the accounts.");
    }
}
class Teacher implements Command {
    public void execute() {
        System.out.println("Take the classes.");
    }
}

class Student implements Command {
    public void execute() {
        System.out.println("Listen to the classes.");
    }
}

public class CommandPattern extends Teacher{
 public static void main( String[] args ) {
	 Principal object1=new Principal();
     object1.execute();
     Administrater object2=new Administrater();
     object2.execute();
     Teacher object=new Teacher();
     object.execute();
	 Student object3=new Student();
     object3.execute();
 }

}
