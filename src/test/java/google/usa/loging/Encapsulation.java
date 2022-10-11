package google.usa.loging;


public class Encapsulation {


	private String name = "Nisan";
	private int salary = 100000;
	private String job = "Qa Automation Engineer";
	
	
	public String getName() {
		return name;
	}


	public int getSalary() {
		return salary;
	}


	public String getJob() {
		return job;
	}
	
	
	public static void main(String[] args) {
		
		
		
		Encapsulation obj = new Encapsulation ();
		
		System.out.println("Employee Name : " + obj.getName() );
		
	    
		
	}
	
}
