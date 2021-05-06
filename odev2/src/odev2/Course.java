package odev2;

public class Course {

	public Course() {
		
	}
	
	int id;
	String name;
	String instructor;
	String unitPrice;
	
	
	public Course(int id, String name, String instructor, String unitPrice) {
		this();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.unitPrice = unitPrice;
		
		}
	

}
