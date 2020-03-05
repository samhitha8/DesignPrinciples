package designpattern;
interface cd{
	public void music();
	public void movies();
}
class cdstores implements cd{
	public void music() { System.out.println("Cd with music!");  }
	public void movies() { System.out.println("Cd with movies"); }
	}
interface application{
	public void musicplaylist();
}
class music implements application{
	public void musicplaylist() { System.out.println("Application with music!");  }
}
class MovieAdapter implements application{
	cdstores cds; 
	    public MovieAdapter(cdstores cds) 
	    { 
	        this.cds = cds; 
	    } 
	  
	    public void musicplaylist() 
	    {  
	        cds.movies(); 
	    } 
}


public class AdapterPattern {

	public static void main(String[] args) {
		System.out.println("The values of cd stored are:");
		cdstores cdobject=new cdstores();
		cdobject.music();
		cdobject.movies();
		System.out.println("The application consists of:");
		music object=new music();
		object.musicplaylist();
		System.out.println("According to the user need we are adapting movies in the place music!1!");
		MovieAdapter object1=new MovieAdapter(cdobject);
		object1.musicplaylist();
		

	}

}
