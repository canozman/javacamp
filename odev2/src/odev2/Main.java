package odev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", "�cretsiz" );
		
		Course course2 = new Course();
	       course2.id = 2;
	       course2.name = "Yaz�l�m Gelitirici Yeti�tirme Kamp� (JAVA + REACT)";
           course2.instructor = "Engin Demiro�";
	       course2.unitPrice = "�cretsiz";
	       
	       
	       Course course3 = new Course(3, "Programlamaya Giri� ��in Temel Kurs", "Engin Demiro�", "�cretsiz");
	       
	       
	       Course[] courses = {course1, course2, course3};
	       
	       for (Course course : courses) {
	    	   System.out.println(course.name);
	    	   System.out.println(course.instructor);
	    	   System.out.println(course.unitPrice);
	    	   
	    	   
	       }
				CourseManager courseManager = new CourseManager();
				courseManager.beIncludedInTheProgram(course1);
				courseManager.beIncludedInTheProgram(course2);
				courseManager.beIncludedInTheProgram(course3);
				
				DonateManager donateManager = new DonateManager();
				donateManager.donateACourse(course1);
				donateManager.donateACourse(course2);
				donateManager.donateACourse(course3);
				
				CardManager cardManager = new CardManager();
				cardManager.addANewCard(course1);
				cardManager.addANewCard(course2);
				cardManager.addANewCard(course3);
				
			
				

	}
 	             

}
